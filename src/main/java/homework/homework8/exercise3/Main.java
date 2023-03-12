package homework.homework8.exercise3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Register register = new Register();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

        while (true)
        {
            System.out.println("1) добавить контракт\n2) предоставление информации о документе");
            switch (scanner.nextInt())
            {
                case 1:
                    System.out.println("""
                            1) добавить контракт на поставку товаров
                            2) добавить контракт с сотрудником
                            3) добавить финансовую накладную
                            """);
                    switch (scanner.nextInt())
                    {
                        case 1:
                            System.out.println("номер, дату документа, тип товаров и их кол-во:");
                            register.saveInRegister(new PurcahaseContract(scanner.nextInt(), format.parse(scanner.next()),
                                    scanner.next(), scanner.nextInt()));
                            break;
                        case 2:
                            System.out.println("номер, дату документа, имя сотрудника и дата окончания контракта:");
                            register.saveInRegister(new EmployeeContract(scanner.nextInt(), format.parse(scanner.next()),
                                    scanner.next(), format.parse(scanner.next())));
                            break;
                        case 3:
                            System.out.println("номер, дату документа, итоговая сумма за месяц и код департамента:");
                            register.saveInRegister(new FinancialInvoice(scanner.nextInt(), format.parse(scanner.next()),
                                    scanner.nextInt(), scanner.next()));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("всего документов " + register.register.size());
                    if (register.register.size() != 0)
                    {
                        System.out.println("выберите номер документа: ");
                        register.printInformation(scanner.nextInt());
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
