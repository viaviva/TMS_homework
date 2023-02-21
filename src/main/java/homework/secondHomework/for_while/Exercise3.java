package homework.secondHomework.for_while;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        number = scanner.nextInt();
        int sum = 0;

        if (number > 1)
        {
            for (int i = 1; i <= number; i++)
            {
                sum += i;
            }
        }
        else if (number < 1)
        {
            for (int i = 1; i >= number; i--)
            {
                sum += i;
            }
        }
        else
        {
            System.out.println("введенное число равно 1");
        }

        System.out.println("полученная сумма: " + sum);
    }
}
