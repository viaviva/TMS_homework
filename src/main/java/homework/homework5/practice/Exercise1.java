package homework.homework5.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[random.nextInt(10)][random.nextInt(10)];
        int max = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = random.nextInt(10);
                if (array[i][j] > max)
                {
                    max = array[i][j];
                }
            }

            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(max);
    }
}
