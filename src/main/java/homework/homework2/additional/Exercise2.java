package homework.homework2.additional;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        float sum;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите сумму вклада:");
        sum = scanner.nextFloat();
        System.out.println("введите кол-во месяцев:");
        month = scanner.nextInt();

        for (int i = 0; i < month; i++)
        {
            sum = (float) (sum * 1.07);
        }
        System.out.println("сумма через " + month + " месяцев: " + sum);
    }
}
