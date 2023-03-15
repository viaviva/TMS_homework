package homework.homework9.exercise1;

public class Student extends Person{
    private String group;

    public Student() {
    }

    public Student(String group) {
        this.group = group;
    }

    public Student(String name, String surname, String group) {
        super(name, surname);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                "} " + super.toString();
    }
}
