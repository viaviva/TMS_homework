package homework.homework2.if_else;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        while (true)
        {
            int temperature;
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число:");
            temperature = scanner.nextInt();

            if (temperature > -5)
            {
                System.out.println("тепло");
            }
            else if (temperature > -20)
            {
                System.out.println("нормально");
            }
            else
            {
                System.out.println("холодно");
            }
        }
    }
}
