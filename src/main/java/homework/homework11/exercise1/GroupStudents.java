package homework.homework11.exercise1;

import java.util.List;

public class GroupStudents {
    private String group;
    private int countOfStudents;

    public GroupStudents(String group, int countOfStudents) {
        this.group = group;
        this.countOfStudents = countOfStudents;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }
}
