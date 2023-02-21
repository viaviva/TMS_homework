package homework.thirdHomework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] output_array = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10);
        }

        System.out.println("введите значение:");
        int check = scanner.nextInt();
        boolean isAlive = false;
        int j = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (check != array[i])
            {
                output_array[j] = array[i];
                j++;
            }
            else
            {
                isAlive = true;
            }
        }

        if (!isAlive)
        {
            System.out.println("числа нету в массиве!");
        }

        System.out.println(Arrays.toString(output_array));
        System.out.println(Arrays.toString(array));

    }
}
