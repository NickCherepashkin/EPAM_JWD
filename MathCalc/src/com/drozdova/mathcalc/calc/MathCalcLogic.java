package com.drozdova.mathcalc.calc;

public class MathCalcLogic {
    public boolean checkSumQuality(int number) {
        int sum_1 = number / 1000 + number / 100 % 10;
        int sum_2 = number % 10 + number % 100 / 10;
        return (sum_1 == sum_2);
    }

    public double formula (double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }

    public double perimeter(double a, double b) {
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b);
    }

    public double square(double a, double b) {
        return (a * b / 2);
    }

    public boolean isPointBelong(double x, double y) {
        return ((y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4));
    }
}
