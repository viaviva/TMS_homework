package homework.thirdHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int array_length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение:");
        array_length = scanner.nextInt();

        double[] array = new double[array_length];

        for (int i = 0; i < array_length; i++)
        {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = max;
        double average_value = 0;

        for (int i = 0; i < array_length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }

            if (min > array[i])
            {
                min = array[i];
            }

            average_value += array[i];
        }

        average_value /= array_length;
        System.out.println("максимальное: " + max);
        System.out.println("минимальное: " + min);
        System.out.println("среднее: " + average_value);
        System.out.println(Arrays.toString(array));
    }
}
