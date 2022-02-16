// Даны три действительных числа. Возвести в квадрат те из них,
// значения которых неотрицательны, и в четвертую степень — отрицательные.

import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Enter 3 numbers:");
        a = enterNumber();
        b = enterNumber();
        c = enterNumber();

        double res_1 = pow(a);
        double res_2 = pow(b);
        double res_3 = pow(c);

        System.out.println(res_1);
        System.out.println(res_2);
        System.out.println(res_3);
    }

    public static double pow (double number) {
        double result;
        if (number >= 0) result = Math.pow(number, 2);
        else result = Math.pow(number, 4);
        return result;
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
