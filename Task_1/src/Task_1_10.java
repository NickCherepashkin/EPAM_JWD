// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	1	2	3	.	n
//	n	n-1	n-2	.	1
//	1	2	3	.	n
//	n	n-1	n-2	.	1

//	.	.	.	.	.
//	.	.	.	.	.
//	.	.	.	.   .
//	n	n-1	n-2	.	1


import java.util.Random;

public class Task_1_10 {
    public static void main(String[] args) {
        createMatrix();
    }

    public static void createMatrix() {
        Random random = new Random();
        // n и m в диапазоне от 2 до 10 и четное
        int n;
        do {
            n = random.nextInt(9) + 2;
        }
        while (n % 2 != 0);

        int matrix[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = n - j;
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}