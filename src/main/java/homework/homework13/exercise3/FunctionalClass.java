package homework.homework13.exercise3;

import java.util.Scanner;

@FunctionalInterface
interface MyFunctional {
    void myFunction();
}

public class FunctionalClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyFunctional myFunctionalString = () -> System.out.println(new StringBuilder(scanner.next()).reverse());
        MyFunctional myFunctionalInteger = () -> System.out.println(getFactorial(scanner.nextInt()));

        System.out.println("введите число:");
        switch (scanner.nextInt()) {
            case 1 -> myFunctionalString.myFunction();
            case 2 -> myFunctionalInteger.myFunction();
        }
    }

    public static int getFactorial(int newInt) {
        int result = 1;
        for (int i = 1; i <= newInt; i++) {
            result = result * i;
        }
        return result;
    }
}
