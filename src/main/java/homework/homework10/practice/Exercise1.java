package homework.homework10.practice;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("кол-во строк: ");
        String[] string_array = new String[scanner.nextInt()];

        for (int i = 0; i < string_array.length; i++)
        {
            System.out.println("введите " + (i + 1) + " строку:");
            string_array[i] = scanner.next();
        }

        String max_string = "";
        String min_string = string_array[0];
        for (String s : string_array)
        {
            if (max_string.length() < s.length()) {
                max_string = s;
            }
            if (s.length() < min_string.length())
            {
                min_string = s;
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(min_string).append(":").append(min_string.length()).append(" ").append(max_string).append(":")
                             .append(max_string.length()));
    }
}
