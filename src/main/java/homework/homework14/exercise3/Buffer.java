package homework.homework14.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Buffer {
    private static List<Integer> list = new ArrayList<>();

    public static List<Integer> getList() {
        return list;
    }

    public static void add()
    {
        Random random = new Random();
        synchronized (Buffer.class)
        {
            list.add(random.nextInt(30));
        }

    }
}
