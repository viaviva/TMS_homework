package homework.secondHomework.if_else;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int month_number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("введите номер месяца:");
            month_number = scanner.nextInt();
        } while (month_number <= 0 || month_number >= 13);

        switch (month_number){
            case 1:
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четыре");
                break;
            case 5:
                System.out.println("пять");
                break;
            case 6:
                System.out.println("шесть");
                break;
            case 7:
                System.out.println("семь");
                break;
            case 8:
                System.out.println("восемь");
                break;
            case 9:
                System.out.println("девять");
                break;
            case 10:
                System.out.println("десять");
                break;
        }
    }
}