package com.drozdova.expressionlib.controller;

import com.drozdova.expressionlib.error.ExpressionError;
import com.drozdova.expressionlib.logic.ExpressionLogic;
import com.drozdova.expressionlib.parser.ExpressionParser;

import java.util.List;

public class Expression {
    public static double calculateValue (String expression) {
        ExpressionError.isCorrect(expression);
        // создание объекта для разбора строки
        ExpressionParser parser = new ExpressionParser();
        // разбор выражения
        List<String> expressList = parser.parse(expression);
        // вычисление разобранного выражения
        return ExpressionLogic.calc(expressList);
    }
}
