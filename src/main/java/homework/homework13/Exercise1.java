package homework.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = initArrayList();
        System.out.println(numbers);

        AtomicLong sum = new AtomicLong();
        long count = numbers.stream()
                .distinct()
                .peek(number ->
                {
                    if (numbers.indexOf(number) > 6 && numbers.indexOf(number) < 18)
                    {
                        if (number % 2 == 0)
                        {
                            System.out.println(number);
                        }
                    }
                })
                .map(number -> number * 2)
                .sorted()
                .peek(number ->
                {
                    if (numbers.indexOf(number) < 4)
                    {
                        System.out.println(number);
                    }
                    sum.addAndGet(number);
                })
                .count();
        System.out.println("Count " + count);
        System.out.println("Average " + sum.get()/count);
    }

    private static ArrayList<Integer> initArrayList()
    {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            numbers.add(random.nextInt(30));
        }
        return numbers;
    }
}
