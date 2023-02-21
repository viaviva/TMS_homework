package homework.secondHomework;

public class Exercise1 {
    public static void main(String[] args) {
        int number1 = 0, number2 = 1;
        System.out.println(number1);
        System.out.println(number2);
        int number3;

        for (int i = 0; i < 9; i++)
        {
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
