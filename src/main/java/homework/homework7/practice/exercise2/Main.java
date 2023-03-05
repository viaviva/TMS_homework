package homework.homework7.practice.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол-во градусов по Цельсию и во что переводим (К или F)");
        BaseConverter.convert(scanner.nextFloat(), scanner.next().charAt(0));
    }
}
