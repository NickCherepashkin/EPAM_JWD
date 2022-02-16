package com.drozdova.mathcalc.controller;

import com.drozdova.mathcalc.calc.MathCalcLogic;
import com.drozdova.mathcalc.input.MathCalcInput;
import com.drozdova.mathcalc.view.MathCalcView;

public class MathCalcController {

    public static void main(String[] args) {
        MathCalcInput input = new MathCalcInput();
        MathCalcLogic calc = new MathCalcLogic();
        MathCalcView view = new MathCalcView();

        // Task_1
        int num = input.getRandomNum(1000, 9999);
        String message = "Result: ";
        view.outputMessage(message + calc.checkSumQuality(num));

        // Task_2
        message = "Enter a: ";
        double a = input.enterNumber(message);
        message = "Enter b: ";
        double b = input.enterNumber(message);
        message = "Enter c: ";
        double c = input.enterNumber(message);
        double result = calc.formula(a, b, c);
        message = "result: ";
        view.outputMessage(message + result);

        // Task_3
        message = "Enter a: ";
        a = input.enterNumber(message);
        message = "Enter b: ";
        b = input.enterNumber(message);
        double perimeter = calc.perimeter(a, b);
        double square = calc.square(a, b);
        message = "Perimeter: ";
        view.outputMessage(message + perimeter);
        message = "Square: ";
        view.outputMessage(message + square);

        // Task_4
        double x = input.enterNumber("Enter x: ");
        double y = input.enterNumber("Enter y: ");
        view.outputMessage("result: " + calc.isPointBelong(x, y));


        // Task_10
        int n = input.getRandomEvenNum(1,10);
        int [][] matrix = input.createMatrix(n);
        view.outputMatrixOnConsole(matrix);

    }
}
