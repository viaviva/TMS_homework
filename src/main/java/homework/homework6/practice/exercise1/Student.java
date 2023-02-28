package homework.homework6.practice.exercise1;

import java.util.Random;

public class Student
{
    String name;
    String group;
    int mark;

    public Student()
    {
    }

    public Student(String name) {
        Random random = new Random();

        this.name = name;
        this.group = "014301";
        this.mark = random.nextInt(11);
    }

    public Student(String name, String group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }
}
