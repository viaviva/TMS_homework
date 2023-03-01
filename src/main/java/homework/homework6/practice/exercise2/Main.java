package homework.homework6.practice.exercise2;

import homework.homework6.practice.exercise1.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] array = new Student[5];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("введите значение для " + (i + 1) + " студента:");
            array[i] = new Student(scanner.next());
            System.out.println(array[i]);
        }
    }
}
