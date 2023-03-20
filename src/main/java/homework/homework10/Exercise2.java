package homework.homework10;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку с произвольными словами: ");
        String string = scanner.nextLine();
        String[] split_string = string.split(" ");

        String max_string = "";
        String min_string = split_string[0];
        for (int i = 0; i < split_string.length; i++)
        {
            if (max_string.length() <= split_string[i].length())
            {
                max_string = split_string[i];
            }

            if (split_string[i].length() <= min_string.length())
            {
                min_string = split_string[i];
            }
        }
        System.out.println("самое короткое: " + min_string + "\nсамое длинное: " + max_string);
    }
}
