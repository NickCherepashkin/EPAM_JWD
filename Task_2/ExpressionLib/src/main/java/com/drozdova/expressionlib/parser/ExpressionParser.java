package com.drozdova.expressionlib.parser;

import com.drozdova.expressionlib.util.Delimiter;
import com.drozdova.expressionlib.util.Operator;
import java.util.*;

public class ExpressionParser {

    private static final String delimiters = Delimiter.ALL_DELIMITERS + Operator.ALL_OPERATORS;

    // проверка является ли символ разделителем
    private static boolean isDelimiter(String token) {
        // число от 10 и больше
        if (token.length() > 1) {
            return false;
        }

        for (int i = 0; i < delimiters.length(); i++) {
            if (token.charAt(0) == delimiters.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isOperator(String token) {
        int lenght = Operator.ALL_OPERATORS.length();
        for (int i = 0; i < lenght; i++) {
            if (token.charAt(0) == Operator.ALL_OPERATORS.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // присвоение операии или скобке приоритета
    private static int priority(String token) {
        switch (token) {
            case Operator.PLUS: case Operator.MINUS:
                return 1;
            case Operator.MULTIPLICATION: case Operator.DIVISION:
                return 2;
            default:
                return 0;
        }
    }

    // функция разбора строки
    public static List<String> parse(String expression) {
        List<String> parsingList = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        StringTokenizer tokenizer = new StringTokenizer(expression, delimiters, true);
        String token = "";
        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            if (token.equals(Delimiter.SPACE)) {
                continue;
            } else if (isDelimiter(token)) {
                if (token.equals(Delimiter.OPEN_BRACKET)) {
                    stack.push(token);
                }
                else if (token.equals(Delimiter.CLOSE_BRACKET)) {
                    while (!stack.peek().equals(Delimiter.OPEN_BRACKET)) {
                        parsingList.add(stack.pop());
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && (priority(token) <= priority(stack.peek()))) {
                        parsingList.add(stack.pop());
                    }
                    stack.push(token);
                }
            } else {
                parsingList.add(token);
            }
        }
        while (!stack.isEmpty()) {
            if (isOperator(stack.peek())) parsingList.add(stack.pop());
        }
        return parsingList;
    }
}
