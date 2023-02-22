package homework.homework5.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5);
        int[][] array = new int[n][n];
        int sum = 0;
        int k = n-1;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                array[i][j] = random.nextInt(10);
            }
            sum += array[i][k--];
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println(sum);
    }
}
