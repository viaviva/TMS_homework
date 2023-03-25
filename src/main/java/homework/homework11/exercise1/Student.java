package homework.homework11.exercise1;
public class Student {
    private String name;
    private String group;
    private int mark;

    public Student() {
    }

    public Student(String name, String group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public Student(String group, int mark) {
        this.group = group;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(int mark) {
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
