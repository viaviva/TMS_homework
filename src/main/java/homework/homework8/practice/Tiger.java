package homework.homework8.practice;

import java.util.Calendar;

public class Tiger extends Cat{
    private int countEatenExployees;

    public Tiger() {
    }

    public Tiger(int animal_id, String name, Calendar birthday, String eyesColor, int countEatenExployees) {
        super(animal_id, name, birthday, eyesColor);
        this.countEatenExployees = countEatenExployees;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "countEatenExployees=" + countEatenExployees +
                "} " + super.toString();
    }
}
