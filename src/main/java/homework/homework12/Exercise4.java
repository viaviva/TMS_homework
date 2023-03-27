package homework.homework12;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Float> studentsMap = new HashMap<>();

        while (true)
        {
            System.out.println("""
                    1) добавить студента
                    2) вывести всех
                    3) вывести кол-во студентов
                    4) вывести на экран самого худшего студента
                    else - выход
                    """);
            switch (scanner.nextInt())
            {
                case 1:
                    System.out.println("введите имя студента и его оценку: ");
                    studentsMap.put(scanner.next(), scanner.nextFloat());
                    break;
                case 2:
                    System.out.println(studentsMap);
                    break;
                case 3:
                    System.out.println(studentsMap.size());
                    break;
                case 4:
                    String minStudent = studentsMap.keySet().iterator().next();
                    for (Map.Entry<String, Float> student : studentsMap.entrySet())
                    {
                        if (student.getValue() < studentsMap.get(minStudent))
                        {
                            minStudent = student.getKey();
                        }
                    }
                    System.out.println(minStudent + " - " + studentsMap.get(minStudent));
                    break;
                default:
                    return;
            }
        }
    }
}
