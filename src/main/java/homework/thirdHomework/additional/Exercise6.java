package homework.thirdHomework.additional;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        String[] names = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("введите " + (i+1) + " значение массива:");
            names[i] = scanner.next();
        }
        System.out.println(Arrays.toString(Arrays.stream(names).sorted().toArray()));
    }
}
