package homework.homework7.additional;

public class Student extends Person{
    private String group;
    private int place;
    private Hostel hostel;

    public Student() {
        super();
    }

    public Student(String name, String surname, String group) {
        super(name, surname);
        this.group = group;
    }

    public void settlement(int index, Hostel hostel)
    {
        this.place = index;
        this.hostel = hostel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", place=" + place +
                ", hostel=" + hostel +
                "} " + super.toString();
    }
}
