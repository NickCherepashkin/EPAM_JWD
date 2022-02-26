package com.drozdova.expressionlib.logic;

import com.drozdova.expressionlib.util.Operator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ExpressionLogic {
    public static Double calc(List<String> parsingList) {
        Deque<Double> stack = new ArrayDeque<>();

        for (String x : parsingList) {
            if (x.equals(Operator.PLUS)) {
                stack.push(performAnOperation(stack.pop(), stack.pop(), Operator.PLUS));
            } else if (x.equals(Operator.MINUS)) {
                stack.push(performAnOperation(stack.pop(), stack.pop(), Operator.MINUS));
            } else if (x.equals(Operator.MULTIPLICATION)) {
                stack.push(performAnOperation(stack.pop(), stack.pop(), Operator.MULTIPLICATION));
            } else if (x.equals(Operator.DIVISION)) {
                stack.push(performAnOperation(stack.pop(), stack.pop(), Operator.DIVISION));
            } else {
                stack.push(Double.valueOf(x));
            }
        }
        return stack.pop();
    }

    private static Double performAnOperation (Double a, Double b, String operator) {
        if (operator.equals(Operator.PLUS)) {
            return (a + b);
        } else if (operator.equals(Operator.MINUS)) {
            return (b - a);
        } else if (operator.equals(Operator.MULTIPLICATION)) {
            return (a * b);
        } else {
            return (b / a);
        }
    }
}
