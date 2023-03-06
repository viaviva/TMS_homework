package homework.homework7.practice.exercise2;

public class BaseConverter {
    static void convert(float value, char type)
    {
        System.out.println("по Цельсию: " + value);
        switch (type)
        {
            case 'K' :
                System.out.println("по Кельвину: " + (value + 273.15));
                break;
            case 'F':
                System.out.println("по Френгейту: " + (1.8 * value + 32));
                break;
            default:
                System.out.println("неккоректное значение");
                break;
        }
    }
}
