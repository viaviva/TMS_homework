package homework.homework9.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try
        {
            while (true)
            {
                System.out.println("""
                        1) добавить машину
                        2) найти машину по номеру
                        3) кол-во машин по возрасту
                        """);
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("введите марку, номер и год выпуска: ");
                        Parking.setCars(new Car(scanner.next(), scanner.next(), scanner.nextInt()));
                        break;
                    case 2:
                        System.out.println("введите номер машины:");
                        System.out.println(Parking.checkCar(scanner.next()).toString());
                    case 3:
                        System.out.println("введите год:");
                        System.out.println("кол-во машин: " + Parking.countByYears(scanner.nextInt()));
                    default:
                        System.out.println("выход из программы");
                        return;
                }
            }
        } catch (InputMismatchException | NoVinException | NullPointerException ex)
        {
            System.out.println(ex);
        }
    }
}
