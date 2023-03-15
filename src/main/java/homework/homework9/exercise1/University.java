package homework.homework9.exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class University
{
    private static List groups = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();
    private static List subjects = new ArrayList<>();
    private static List teachers = new ArrayList<>();
    private static Timetable[][] timetables = new Timetable[10][5];

    public List getSubjects() {
        return subjects;
    }

    public List getStudents() {
        return students;
    }

    public List getGroups() {
        return groups;
    }

    public void setSubjects(String subject) {
        subjects.add(subject);
        System.out.println("\nпредмет "+ subject + " УСПЕШНО ДОБАВЛЕН\n");
    }

    public void setStudents(Student student) {
        students.add(student);
        System.out.println("\nстудент УСПЕШНО ДОБАВЛЕН\n");
    }

    public void setGroups(String group) {
        groups.add(group);
        System.out.println("\nгруппа "+ group +" УСПЕШНО ДОБАВЛЕНА\n");
    }

    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("\nстудент УСПЕШНО ДОБАВЛЕН\n");
    }

    public void printInformation(int number)
    {
        List list = University.switchList(number);

        if (!list.isEmpty()) {
            for (Object object : list) {
                System.out.println(object);
            }
        }
        else
        {
            System.out.println("данные отсутстуют!");
        }
    }

    public static boolean checkData(String data, int number)
    {
        return switchList(number).contains(data);
    }

    public static List switchList(int number)
    {
        List list = null;
        switch (number) {
            case 1 -> list = students;
            case 2 -> list = teachers;
            case 3 -> list = groups;
            case 4 -> list = subjects;
        }
        return list;
    }

    public static void generateTimetable()
    {
        for (int i = 0; i < groups.size(); i++)
        {
            for (int day = 0; day < 5; day++)
            {
                timetables[i][day] = new Timetable();
            }
        }
    }

    public static void printAllTimetable(int indexOfGroup)
    {
        for (int i = 0; i < 5; i++)
        {
            DayOfWeek dayOfWeek = null;
            System.out.println(dayOfWeek.of(i+1));
            System.out.println(timetables[indexOfGroup][i]);
        }
    }

    public static void printTimetable(int indexOfGroup, LocalDate date)
    {
        DayOfWeek dayOfWeek = DayOfWeek.from(date);
        System.out.println(dayOfWeek.name());
        System.out.println(timetables[indexOfGroup][dayOfWeek.getValue() - 1]);
    }

    public static int printGroupBySurname(String surname)
    {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getSurname().equals(surname))
            {
                return groups.indexOf(students.get(i).getGroup());
            }
        }
        return 9999999;
    }

    public static boolean checkSurname(int index)
    {
        if (index != 9999999)
        {
            return true;
        }
        else
        {
            System.out.println("студента с такаой фамилией не существует!");
            return false;
        }
    }
}
