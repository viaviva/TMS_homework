package homework.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> names = initArrayList();
        AtomicInteger countOfName = new AtomicInteger();

        String firstName = names.stream()
                .peek(name ->
                {
                    if (name.equalsIgnoreCase("sasha"))
                    {
                        countOfName.getAndIncrement();
                    }
                })
                .peek(name ->
                {
                    if (name.toLowerCase().startsWith("a"))
                    {
                        System.out.println(name);
                    }
                })
                .sorted().findFirst().orElse("@Empty");

        System.out.println(countOfName);
        System.out.println(firstName);
    }

    public static ArrayList<String> initArrayList() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ilya");
        names.add("Sasha");
        names.add("Anna");
        names.add("Ksenia");
        names.add("Sasha");
        names.add("Angelina");
        names.add("Ivan");
        names.add("SASHA");
        names.add("Alina");
        names.add("Nikita");

        return names;
    }
}

