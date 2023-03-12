package homework.homework8.practice;

import java.util.Calendar;

public abstract class Animal {
    private int animal_id;
    private String name;
    private Calendar birthday;

    public Animal() {
    }

    public Animal(int animal_id, String name, Calendar birthday) {
        this.animal_id = animal_id;
        this.name = name;
        this.birthday = birthday;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "Animal{" +
                "animal_id=" + animal_id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
