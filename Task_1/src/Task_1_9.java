// Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
// включив второй массив между k-м и (k+1) - м элементами первого.

import java.util.Random;

public class Task_1_9 {
    public static void main(String[] args) {
        int [] array_1 = createArray();
        int [] array_2 = createArray();
        int k = enterNumber(array_1.length);
        System.out.println("k = " + k);
        int [] array = expandArray(array_1, array_2, k);
        printArray(array);
    }

    public static int[] createArray() {
        // n в диапазоне от 1 до 20
        // array's size
        int n = enterNumber(20);

        int array[] = new int[n];
        System.out.print("Array: ");
        for(int index = 0; index < n; index++) {
            array[index] = enterNumber(100);
            System.out.print(array[index] + " ");
        }
        System.out.println();
        return array;
    }

    public static int enterNumber(int range) {
        Random random = new Random();
        return random.nextInt(range) + 1;
    }

    public static int[] expandArray(int [] array_1, int [] array_2, int k) {
        int [] array = new int[array_1.length + array_2.length];
        for (int i = 0; i < array.length; i++) {
            if (i < k) array[i] = array_1[i];
            else if(i >= k && i <  array_2.length + k) array[i] = array_2[i - k];
            else  array[i] = array_1[i - array_2.length];
        }
        return array;
    }

    public static void printArray(int [] array) {
        System.out.print("Extended array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
