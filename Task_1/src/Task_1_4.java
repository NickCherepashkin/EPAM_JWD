// Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит
// закрашенной области, и false — в противном случае

import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты (x, y): ");

        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println("Error value x.");
        }
        int x = scan.nextInt();

        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println("Error value y.");
        }
        int y = scan.nextInt();

        scan.close();
        boolean result;
        result = ((y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4));
        System.out.println(result);
    }
}
