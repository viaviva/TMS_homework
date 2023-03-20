package homework.homework10;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите произвольную строку: ");
        String input_string = scanner.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input_string.length(); i++)
        {
            sb.append(input_string.charAt(i)).append(input_string.charAt(i));
        }
        System.out.println(sb);
    }
}
