package com.drozdova.expressionlib.error;

import com.drozdova.expressionlib.util.Delimiter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionError {
    public static final String STRING_IS_EMPTY = "Ошибка:  введена пустая строка.";
    public static final String COUNT_OF_BRACKETS_NOT_EQUAL = "Ошибка: количество открывающих и закрывающих скобокк не совпадает.";
    public static final String STRING_CONTAINS_INVALID_CHARACTERS = "Ошибка: данная строка содержит недопустимые символы.";
    public static final String EXPRESSION_START_NOT_CORRECT = "Ошибка: выражение введено не корректно.";

    private static void isEmpty (String expression) {
        if (expression.isEmpty()) {
            throw new RuntimeException(STRING_IS_EMPTY);
        }
    }

    public static void isCorrect(String expression) {
        isEmpty(expression);
        hasInvalidCharacter(expression);
        isInvalidExpression(expression);
    }

    private static void hasInvalidCharacter(String expression) {
        String regEx = "[^\\d\\s\\(\\)\\+\\-\\*\\/]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(expression);
        if (matcher.find()) {
            throw new RuntimeException(STRING_CONTAINS_INVALID_CHARACTERS);
        }
    }

    private static void isInvalidExpression(String expression) {
        String str = expression.replace(" ", "");
        String regEx = "(\\)[0-9])|(\\(\\))|(\\)\\()|(\\+\\))|(-\\))|(\\*\\))|(/\\))|(\\(\\+)|(\\(-)|(\\(\\*)|(\\(/)|(\\+\\+)|(//)|(\\*\\*)|(--)";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            throw new RuntimeException(EXPRESSION_START_NOT_CORRECT);
        }

        if((str.charAt(0) != '(') && !(str.charAt(0) >= 48 && str.charAt(0) <= 57)) {
            throw new RuntimeException(EXPRESSION_START_NOT_CORRECT);
        }

        int countOpenBracket = 0;
        int countCloseBracket = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == Delimiter.OPEN_BRACKET.charAt(0)) {
                countOpenBracket++;
            } else if (expression.charAt(i) == Delimiter.CLOSE_BRACKET.charAt(0)) {
                countCloseBracket++;
            }
        }
        if (countOpenBracket != countCloseBracket) {
            throw new RuntimeException(ExpressionError.COUNT_OF_BRACKETS_NOT_EQUAL);
        }
    }
}
