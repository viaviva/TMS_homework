package homework.thirdHomework;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        int[] first_array = new int [5];
        int[] second_array = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++)
        {
            first_array[i] = random.nextInt(10);
            second_array[i] = random.nextInt(10);
        }

        int first_average = 0;
        int second_average = 0;

        for (int i = 0; i < 5; i++)
        {
            first_average += first_array[i];
            second_average += second_array[i];
        }

        System.out.println(Arrays.toString(first_array));
        System.out.println(Arrays.toString(second_array));
        System.out.println("первое арифметическое: " + (first_average /= 5));
        System.out.println("второе аривметическое: " + (second_average /= 5));

        if (first_average > second_average)
        {
            System.out.println("\nпервое больше!");
        }
        else if (second_average > first_average)
        {
            System.out.println("второе больше!");
        }
        else
        {
            System.out.println("одинаковы!");
        }
    }
}
