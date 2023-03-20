package homework.homework10.practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол-во строк: ");
        String[] string_array = new String[scanner.nextInt()];

        int average_length = 0;
        for (int i = 0; i < string_array.length; i++)
        {
            System.out.println("введите " + (i + 1) + " строку:");
            string_array[i] = scanner.next();
            average_length += string_array[i].length();
        }
        average_length /= string_array.length;

        StringBuilder sb = new StringBuilder();
        for (String s : string_array)
        {
            if (s.length() > average_length)
            {
                sb.append(s).append(":").append(s.length()).append(" ");
            }
        }
        System.out.println(sb);
    }
}
