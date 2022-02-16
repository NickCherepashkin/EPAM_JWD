// Написать программу нахождения суммы большего и меньшего из трех чисел.

import java.util.Scanner;

public class Task_1_6 {
    public static void main(String[] args) {
        int a = enterNumber();
        int b = enterNumber();
        int c = enterNumber();

        int result = sumMinMax(a, b, c);
        System.out.println(result);
    }

    public static int enterNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Error value. Try again.");
        }
        int number = scan.nextInt();
        return number;
    }

    public static int sumMinMax(int a, int b, int c) {
        int min;
        int max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        if (min > c) min = c;
        else if (max < c) max = c;

        int sum = min + max;
        return sum;
    }
}