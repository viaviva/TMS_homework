package homework.homework10.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input_string;
        do {
            System.out.println("введите строку (xxxx-yyy-xxxx-yyy-xyxy, где х - это число, а y - это символ):");
            input_string = scanner.nextLine();
        } while (!StringRedactor.inputCheck(input_string));
        System.out.println("строка в норме");

        StringRedactor.printString(input_string);
    }
}
