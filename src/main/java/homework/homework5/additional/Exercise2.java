package homework.homework5.additional;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        for (int[] i : array1) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
        for (int[] i : array2) {
            System.out.println(Arrays.toString(i));
        }

        int[][] multiply_array = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                for (int k = 0; k < array2.length; k++)
                {
                    multiply_array[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println();

        for (int[] ints : multiply_array) {
            System.out.println(Arrays.toString(Arrays.stream(ints).sorted().toArray()));
        }
    }
}
