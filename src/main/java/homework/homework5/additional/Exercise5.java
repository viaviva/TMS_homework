package homework.homework5.additional;

import java.util.Arrays;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[random.nextInt(6)][random.nextInt(6)];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println();

        for (int[] ints : array) {
            System.out.println(Arrays.toString(Arrays.stream(ints).sorted().toArray()));
        }
    }
}
