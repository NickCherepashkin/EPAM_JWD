// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        while(!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Error value!");
        }
        double a = scan.nextDouble();

        System.out.println("Enter b: ");
        while(!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Error value!");
        }
        double b = scan.nextDouble();
        System.out.println("Perimeter: " + perimeter(a, b));
        System.out.println("Square: " + square(a, b));

    }

    public static double perimeter(double a, double b) {
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b);
    }

    public static double square(double a, double b) {
        return (a * b / 2);
    }
}
