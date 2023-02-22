package homework.homework5.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5);
        int[][] array = new int[n][n];
        int j;
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (j = 0; j < array[i].length; j++)
            {
                array[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(array[i]));
            sum += array[i][i];
        }

        System.out.println(sum);
    }
}
