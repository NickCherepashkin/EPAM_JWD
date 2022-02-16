// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Random;

public class Task_1_8 {
    public static void main(String[] args) {
        int [] array = createArray();
        Random rand = new Random();
        int k = rand.nextInt(9) + 1;
        int sum = findSum(array, k);
        System.out.println("k = " + k);
        System.out.println("sum = " + sum);
    }

    public static int[] createArray() {
        Random random = new Random();
        // n в диапазоне от 1 до 20
        // array's size
        int n = random.nextInt(20) + 1;

        int array[] = new int[n];
        System.out.print("Array: ");
        for(int index = 0; index < n; index++) {
            array[index] = random.nextInt(100) + 1;
            System.out.print(array[index] + " ");
        }
        System.out.println();
        return array;
    }

    public static int findSum(int [] initArray, int initK) {
        int sum = 0;
        for (int index = 0; index < initArray.length; index++) {
            if (initArray[index] % initK == 0) {
                sum += initArray[index];
            }
        }
        return sum;
    }
}