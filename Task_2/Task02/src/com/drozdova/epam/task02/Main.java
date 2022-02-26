package com.drozdova.epam.task02;

import com.drozdova.expressionlib.controller.Expression;

public class Main {
    public static void main(String[] args) throws Exception {
        // "1 + 2 * (3 + 4 / 2 - (1 + 2)) * 2 + 1"
        // ()2+2
        // ((2))
        // (2+2)(5)
        double result = Expression.calculateValue("1 + 2 * (3 + 4 / 2 - (1 + 2)) * 2 + 1");
        System.out.println(result);
    }
}
