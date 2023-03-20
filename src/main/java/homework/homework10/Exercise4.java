package homework.homework10;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку с произвольными словами: ");
        String[] split_string = scanner.nextLine().split(" ");

        boolean check_world = false;
        for (String s : split_string)
        {
            for (int j = 0; j < s.length() / 2; j++)
            {
                check_world = s.charAt(j) == s.charAt(s.length() - j - 1);
            }
            System.out.println(s + " : " + check_world);
        }
    }
}
