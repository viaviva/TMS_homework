package homework.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        int array[] = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10);
        }

        System.out.println("введите значение:");
        int check = scanner.nextInt();
        boolean isAlive = false;

        for (int value : array)
        {
            if (check == value)
            {
                System.out.println("число есть в массиве!");
                isAlive = true;
            }
        }

        if (isAlive == false)
        {
            System.out.println("числа нету в массиве!");
        }

        System.out.println(Arrays.toString(array));
    }
}