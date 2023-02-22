package homework.homework5.additional;

import java.util.Arrays;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5);
        int[][] array = new int[n][n];
        int[] main_diagonal = new int[n];
        int[] side_diagonal = new int[n];
        int k = n-1;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(array[i]));
            main_diagonal[i] = array[i][i];
            side_diagonal[i] = array[i][k--];
        }

        System.out.println("основная диагональ: " + Arrays.toString(main_diagonal));
        System.out.println("побочная диагональ: " + Arrays.toString(side_diagonal));

    }
}
