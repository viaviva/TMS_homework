package homework.homework7.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("63237", "Xiaomi", 200);
        phones[1] = new Phone("7890298", "Nokia", 256);
        phones[2] = new Phone("34678", "Apple", 205);

        Scanner scanner = new Scanner(System.in);

        for (Phone phone : phones)
        {
            System.out.println(phone);
            System.out.println(phone.getNumber());
            System.out.println("введите имя: ");
            phone.receiveCall(scanner.next());
        }

        System.out.println("введите им и номер: ");
        Phone.receiveCall(scanner.next(), scanner.next());
        System.out.println("введите номера: ");
        Phone.sendMessage(scanner.next());
    }
}
