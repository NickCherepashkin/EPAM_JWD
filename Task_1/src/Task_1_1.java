// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае: Сумма двух первых цифр заданного четырехзначного числа
//равна сумме двух его последних цифр

import java.util.Random;

public class Task_1_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(9000) + 1000 ;
        int sum_1 = number / 1000 + number / 100 % 10;
        int sum_2 = number % 10 + number % 100 / 10;
        System.out.println("number = " + number);
        System.out.println("sum_1 = " + sum_1);
        System.out.println("sum_2 = " + sum_2);
        System.out.println("result: " + (sum_1 == sum_2));
    }
}
