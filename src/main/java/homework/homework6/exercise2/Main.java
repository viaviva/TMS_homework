package homework.homework6.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("1. добавить деньги\n2. снять деньги\n3. посмотреть счет");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("введите кол-во купюр, которые вы хотите внести (20, 50, 100):");
                    atm.getMoney(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    System.out.println("введите сумму, которую хотите снять:");
                    if (!atm.dispenseMoney(scanner.nextInt())) {
                        System.out.println("операция не проведена!");
                    }
                    break;
                case 3:
                    System.out.println("оставшая сумма на счете:" + atm.sum());
                    break;
            }
        }
    }
}
