package com.drozdova.mathcalc.view;

public class MathCalcView {
    public void outputMessage (String message) {
        System.out.println(message);
    }

    public void outputMatrixOnConsole (int [][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                outputMessage(matrix[i][j] + " ");
            }
            outputMessage("");
        }
    }
}
