package com.drozdova.mathcalc.input;

import java.util.Random;
import java.util.Scanner;

public class MathCalcInput {
    public int getRandomNum(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max - min + 1) + min;
        return num;
    }

    public int getRandomEvenNum (int min, int max) {
        int n;
        do {
            n = getRandomNum(min, max);
        }
        while (n % 2 != 0);

        return n;
    }

    public int [][] createMatrix (int size) {
        int matrix[][] = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = size - j;
                }
            }
        }
        return matrix;
    }

    public double enterNumber(String message) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String errorMessage = "Error value! Try again.";
        printMessage(message);
        while (!scan.hasNextDouble()) {
            printMessage(errorMessage);
            scan.next();
        }
        return scan.nextDouble();
    }

    public void printMessage (String message) {
        System.out.println(message);
    }
}
