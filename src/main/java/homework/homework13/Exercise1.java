package homework.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = initArrayList();
        System.out.println(numbers);

        numbers.stream()
                .filter(number -> number % 2 == 0 && number >= 6 && number <= 17)
                .forEach(System.out::println);

        numbers.stream().map(number -> number * 2)
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        long count = numbers
                .stream()
                .count();

        long sum = numbers.stream()
                .reduce((number, newNumber) -> number + newNumber)
                .orElse(0);

        System.out.println("Count " + count);
        System.out.println("Average " + sum/count);
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
