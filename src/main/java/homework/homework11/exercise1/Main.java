package homework.homework11.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        while (true)
        {
            System.out.println("""
                    1) добавить студента
                    2) вывести всех студентов с оценкой > 8
                    3) найти группу с min кол-вом студентов""");
            switch (scanner.nextInt())
            {
                case 1:
                    System.out.println("введите имя, группу и оценку: ");
                    students.add(new Student(scanner.next(), scanner.next(), scanner.nextInt()));
                    System.out.println("студент добавлен!");
                    break;
                case 2:
                    StudentAnalysis.checkMark(students);
                    break;
                case 3:
                    System.out.println("группа с минимальным кол-вом студентов: " + StudentAnalysis.checkMinStudents(students));
                    break;
                default:
                    System.out.println("выход из программы");
                    return;
            }
        }
    }
}
