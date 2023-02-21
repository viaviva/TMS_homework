package homework.secondHomework;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        while (true)
        {
            int color_number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число:");
            color_number = scanner.nextInt();

            switch (color_number) {
                case 1:
                    System.out.println("красный");
                    break;
                case 2:
                    System.out.println("оранжевый");
                    break;
                case 3:
                    System.out.println("желтый");
                    break;
                case 4:
                    System.out.println("зеленый");
                    break;
                case 5:
                    System.out.println("голубой");
                    break;
                case 6:
                    System.out.println("синий");
                    break;
                case 7:
                    System.out.println("фиолетовый");
                    break;
                default:
                    System.out.println("введено неккоректное число");
            }
        }
    }
}
