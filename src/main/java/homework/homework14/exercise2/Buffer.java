package homework.homework14.exercise2;

import java.util.*;

public class Buffer {
    private static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public static List<Integer> getList() {
        return list;
    }

    public static void add()
    {
        Random random = new Random();
        list.add(random.nextInt(30));
    }
}
