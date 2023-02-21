package homework.secondHomework.if_else;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int month_number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("введите номер месяца:");
            month_number = scanner.nextInt();
        } while (month_number <= 0 || month_number >= 13);

        if (month_number > 2 && month_number < 6)
        {
            System.out.println("это весна");
        }
        else if (month_number > 5 && month_number < 9)
        {
            System.out.println("это лето");
        }
        else if (month_number > 8 && month_number < 12 )
        {
            System.out.println("это осень");
        }
        else
        {
            System.out.println("это зима");
        }
    }
}
