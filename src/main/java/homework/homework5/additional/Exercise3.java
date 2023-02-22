package homework.homework5.additional;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[random.nextInt(10)][random.nextInt(10)];
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = random.nextInt(10);
                sum += array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(sum);
    }
}
