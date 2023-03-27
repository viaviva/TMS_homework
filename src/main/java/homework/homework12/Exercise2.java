package homework.homework12;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //задание: напишите программу, которая принимает массив целых чисел и находит все пары чисел, сумма которых равна заданному числу

        System.out.println("введите кол-во:");
        Map <Integer, Integer> numbers = new ConcurrentHashMap<>();
        int countOfNumbers = scanner.nextInt();

        for (int i = 0; i < countOfNumbers; )
        {
            System.out.println("введите " + (i + 1) + " число:");
            int newNumber = scanner.nextInt();
            if (numbers.containsKey(newNumber))
            {
                System.out.println("введите число еще раз");
            }
            else
            {
                numbers.put(newNumber, i);
                i++;
            }

        }

        System.out.println("введите сумму: ");
        int sum = scanner.nextInt();

        for (Map.Entry<Integer, Integer> keys : numbers.entrySet())
        {
            for (Map.Entry<Integer, Integer> keysValue : numbers.entrySet())
            {
                if (keys.getKey() + keysValue.getKey() == sum)
                {
                    System.out.println(keys.getKey() + " + " + keysValue.getKey());
                }
            }
            numbers.remove(keys.getKey());
        }
    }
}
