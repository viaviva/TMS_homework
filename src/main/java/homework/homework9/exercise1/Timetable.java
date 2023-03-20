package homework.homework9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Timetable {
    private List couples = new ArrayList<>();

    public Timetable() {
        University university = new University();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(4); i++)
        {
            couples.add(university.getSubjects().get(random.nextInt(university.getSubjects().size())));
        }
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "couples=" + couples +
                '}';
    }
}
