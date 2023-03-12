package homework.homework8.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printable[] persons = new Printable[3];

        while (true)
        {
            System.out.println("1 - создать директора\n2 - создать рабочего\n3 - создать бухгалтера\n4 - print()");
            switch (scanner.nextInt())
            {
                case 1:
                    persons[Person.COUNT] = new Director();
                    break;
                case 2:
                    persons[Person.COUNT] = new Worker();
                    break;
                case 3:
                    persons[Person.COUNT] = new Accountant();
                    break;
                case 4:
                    for (Printable person: persons)
                    {
                        person.print();
                    }
                default:
                    return;
            }
        }
    }
}
