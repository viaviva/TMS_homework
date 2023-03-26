package homework.homework11.exercise3;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    private static Deque<String> inputDeque = new ArrayDeque<>();
    private static Deque<String> outputDeque = new ArrayDeque<>();

    public static void add(String inputString)
    {
        inputDeque.addLast(inputString);
        outputDeque.addFirst(inputString);
        System.out.println("добавлено!");
        System.out.println(inputDeque);
        System.out.println(outputDeque);
    }

    public static void delete()
    {
        if (!inputDeque.isEmpty())
        {
            outputDeque.pollLast();
            inputDeque.pollFirst();
            System.out.println("первый в очереди удаленен!");
        }
        else
        {
            System.out.println("очередь пуста");
        }
    }

    public static void get(int check)
    {
        if (!inputDeque.isEmpty())
        {
            if (check == 0)
            {
                System.out.println(inputDeque.getFirst());
            }
            else
            {
                System.out.println(inputDeque.getLast());
            }
        }
        else
        {
            System.out.println("очередь пуста");
        }
    }

}
