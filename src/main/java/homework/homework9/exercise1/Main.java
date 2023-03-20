package homework.homework9.exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("""
                    1) добавить студента
                    2) добавить преподавателя
                    3) добавить группу
                    4) добавить предмет
                    5) просмотр всех данных
                    6) просмотр расписания
                    7) генерация расписания
                    """);
            switch (scanner.nextInt())
            {
                case 1:
                    if (!university.getGroups().isEmpty())
                    {
                        System.out.println("введите группу, в которую хотите зачислить студента:");
                        String group = scanner.next();
                        if (University.checkData(group, 3))
                        {
                            System.out.println("введите имя, фамилию студента:");
                            university.setStudents(new Student(scanner.next(), scanner.next(), group));
                        }
                        else
                        {
                            System.out.println("такой группы НЕ существует!");
                        }
                    }
                    else
                    {
                        System.out.println("НЕТ существующих групп!");
                    }
                    break;
                case 2:
                    if (!university.getSubjects().isEmpty())
                    {
                        System.out.println("введите предмет, который хотите вести:");
                        String subject = scanner.next();
                        if (University.checkData(subject, 4))
                        {
                            System.out.println("введите имя, фамилию преподавателя:");
                            university.setTeachers(new Teacher(scanner.next(), scanner.next(), subject));
                        }
                        else
                        {
                            System.out.println("такого предмета НЕ существует!");
                        }
                    }
                    else
                    {
                        System.out.println("НЕТ существующих предметов!");
                    }
                    break;
                case 3:
                    System.out.println("введите группу:");
                    university.setGroups(scanner.next());
                    break;
                case 4:
                    System.out.println("введите предмет:");
                    university.setSubjects(scanner.next());
                    break;
                case 5:
                    System.out.println("""
                            1) просмотр студентов
                            2) просмотр преподавателей
                            3) просмотр групп
                            4) просмотр предметов
                            """);
                    university.printInformation(scanner.nextInt());
                    break;
                case 6:
                    University.generateTimetable();
                    System.out.println("""
                            1) просмотр расписания для группы на неделю
                            2) просмотр расписания для студента на неделю
                            3) просмотр расписания для студента на конкретный день
                            4) просмотр расписания на сегодняшний день
                            """);

                    LocalDate date = null;
                    int numberOfGroup;

                    switch (scanner.nextInt())
                    {
                        case 1:
                            System.out.println("введите группу:");
                            University.printAllTimetable(university.getGroups().indexOf(scanner.next()));
                            break;
                        case 2:
                            System.out.println("введите фамилию студента:");
                            numberOfGroup = University.printGroupBySurname(scanner.next());

                            if (University.checkSurname(numberOfGroup))
                            {
                                University.printAllTimetable(numberOfGroup);
                            }
                            break;
                        case 3:
                            System.out.println("введите фамилию студента:");
                            numberOfGroup = University.printGroupBySurname(scanner.next());

                            if (University.checkSurname(numberOfGroup))
                            {
                                System.out.println("введите дату(yyyy mm dd):");
                                University.printTimetable(numberOfGroup, LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                            }
                            break;
                        case 4:
                            System.out.println("введите фамилию студента:");
                            numberOfGroup = University.printGroupBySurname(scanner.next());

                            if (University.checkSurname(numberOfGroup))
                            {
                                University.printTimetable(numberOfGroup, LocalDate.now());
                            }
                            break;
                    }
                    break;
                case 7:
                    University.generateTimetable();
                    System.out.println("РАСПИСАНИЕ СГЕНЕРИРОВАНО");
                    break;
                default:
                    return;
            }
        }
    }
}
