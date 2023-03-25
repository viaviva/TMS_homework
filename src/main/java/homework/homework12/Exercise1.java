package homework.homework12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //задание: вводится строка, необходимо подсчитать, сколько раз каждый символ встречается в строке
        System.out.println("введите строку: ");

        String inputString = scanner.next();
        Map<Character, Integer> symbols = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++)
        {
            if (symbols.containsKey(inputString.charAt(i)))
            {
                symbols.put(inputString.charAt(i), symbols.get(inputString.charAt(i)) + 1);
            }
            else
            {
                symbols.put(inputString.charAt(i), 1);
            }
        }
        System.out.println(symbols);
    }
}
