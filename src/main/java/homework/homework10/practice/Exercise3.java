package homework.homework10.practice;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string_array = new String[3];

        for (int i = 0; i < string_array.length; i++)
        {
            System.out.println("введите " + (i + 1) + " строку:");
            string_array[i] = scanner.next();
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(string_array[2]).append(string_array[1].toUpperCase()).append(string_array[0].toLowerCase()));
    }
}
