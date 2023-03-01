package homework.homework6.practice.exercise1;

import java.util.Scanner;

public class Маin
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] array = new Student[14];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("введите значение для " + (i + 1) + " студента:");
            array[i] = new Student(scanner.next(), scanner.next(), scanner.nextInt());
            System.out.println(array[i]);
        }
    }
}
