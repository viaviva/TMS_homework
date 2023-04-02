package homework.homework11.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("""
                    1) добавить в очередь
                    2) удалить из очереди
                    3) посмотреть, кто первый в очереди
                    4) посмотреть, кто последний в очереди
                    else - выход
                    """);
            switch (scanner.nextInt())
            {
                case 1:
                    System.out.println("введите строку: ");
                    MyQueue.add(scanner.next());
                    break;
                case 2:
                    MyQueue.delete();
                    break;
                case 3:
                    MyQueue.get(0);
                    break;
                case 4:
                    MyQueue.get(1);
                    break;
                default:
                    System.out.println("выход из программы");
                    return;
            }
        }
    }
}
