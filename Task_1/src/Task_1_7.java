// Составить программу вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
// Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие
// значения функции:
// F(x) = sin(x)^2 - cos(2x)

import java.util.Scanner;

public class Task_1_7 {
    public static void main(String[] args) {
        System.out.println("Enter values:");
        double a = enterNumber();
        double b = enterNumber();
        double h = enterNumber();

        printResult(a, b, h);
    }

    public static double f (double x) {
        double result = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
        return result;
    }

    public static void printResult( double a, double b, double h) {
        double f;
        System.out.println("======================");
        System.out.println("  x   ||      F(x)    ");
        System.out.println("======================");
        for (double i  = a; i <= b; i += h) {
            f = f(i);
            System.out.println(" " + i + " ||   " + f);
        }
    }

    public static double enterNumber() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) {
            System.out.println("Error value.");
            scan.next();
        }
        double number = scan.nextDouble();
        return number;
    }

}
