package homework.thirdHomework.additional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int array_length = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true)
        {
            System.out.println("введите значение:");
            if (scanner.hasNextInt()) {
                array_length = scanner.nextInt();
            }
            if (array_length < 6 || array_length > 10)
            {
                System.out.println("неккоректное число!");
            }
            else
            {
                break;
            }
        }

        int[] array = new int[array_length];
        for (int i = 0; i < array_length; i++) {
            array[i] = random.nextInt(10);
        }

        int[] another_array = new int[array_length / 2];
        int j = 0;
        for (int i = 1; i < array_length; i+=2)
        {
            another_array[j] = array[i];
            j++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(another_array));
    }
}
