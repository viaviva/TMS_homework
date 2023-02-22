package homework.homework2.if_else;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        while (true){
            int input_number;
            Scanner scanner = new Scanner(System.in);

            System.out.println("выход - любой другой символ\nвведите число:");

            if (scanner.hasNextInt())
            {
                input_number = scanner.nextInt();
                if (input_number % 2 == 0)
                {
                    System.out.println("число четное\n");
                }
                else
                {
                    System.out.println("число нечетное\n");
                }
            }
            else
            {
                System.out.println("программа закончена");
                break;
            }
        }
    }
}
