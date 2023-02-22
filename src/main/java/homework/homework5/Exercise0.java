package homework.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(5);
        int[][][] array = new int[number][number][number];

        System.out.println("введите значение:");
        int input_number = scanner.nextInt();

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                for (int k = 0; k < array[j].length; k++)
                {
                    array[i][j][k] = random.nextInt(5);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                for (int k = 0; k < array[j].length; k++)
                {
                    array[i][j][k] += input_number;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
