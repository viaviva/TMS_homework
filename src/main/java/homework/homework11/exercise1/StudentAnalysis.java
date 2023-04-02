package homework.homework11.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StudentAnalysis {
    public static void checkMark(List<Student> students)
    {
        int countOfStudents = 0;
        for (Student student: students)
        {
            if (student.getMark() > 8)
            {
                countOfStudents++;
                System.out.println(student);
            }
        }

        if (countOfStudents == 0)
        {
            System.out.println("таких студентов нету");
        }
    }

    public static String checkMinStudents(List<Student> students)
    {
        List<GroupStudents> groupStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++)
        {
            GroupStudents newGroupStudent = StudentAnalysis.checkGroup(groupStudents, students.get(i).getGroup());
            if (!groupStudents.isEmpty() || (newGroupStudent != null))
            {
                newGroupStudent.setCountOfStudents(newGroupStudent.getCountOfStudents() + 1);
            }
            else
            {
                groupStudents.add(new GroupStudents(students.get(i).getGroup(), 1));
            }
        }

        int minCountOfStudents = Integer.MAX_VALUE;
        String minGroup = "";
        for (GroupStudents groupStudent : groupStudents)
        {
            if (groupStudent.getCountOfStudents() < minCountOfStudents)
            {
                minCountOfStudents = groupStudent.getCountOfStudents();
                minGroup = groupStudent.getGroup();
            }
        }
        return minGroup;
    }

    private static GroupStudents checkGroup(List<GroupStudents> groupStudents, String group)
    {
        for (GroupStudents groupStudent: groupStudents)
        {
            if (groupStudent.getGroup().equals(group))
            {
                return groupStudent;
            }
        }
        return null;
    }
}
