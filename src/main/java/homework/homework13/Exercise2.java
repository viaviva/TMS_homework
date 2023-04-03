package homework.homework13;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args)
    {
        List<String> names = initArrayList();

        long countOfName = names.stream()
                        .filter(name -> name.equalsIgnoreCase("sasha"))
                        .count();

        String firstName = names.stream()
                        .filter(name -> name.toLowerCase().startsWith("a"))
                        .sorted()
                        .findFirst().orElse("@Empty");

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

