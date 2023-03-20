package homework.homework10;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку с произвольными словами: ");
        String[] split_string = scanner.nextLine().split(" ");

        int differentSimbols = 1;
        int minSimbols = Integer.MAX_VALUE;
        String minString = "";

        for (String s : split_string)
        {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(0) != s.charAt(j)) {
                    differentSimbols++;
                }
            }
            if (differentSimbols < minSimbols) {
                minSimbols = differentSimbols;
                minString = s;
            }
            differentSimbols = 1;
        }
        System.out.println("строка с минимальным кол-вом символов: " + minString);
    }
}
