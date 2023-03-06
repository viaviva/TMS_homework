package homework.homework7.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите ваше имя: ");
        Patient patient = new Patient(scanner.next());

        patient.appointment();
        System.out.println(patient.toString());
    }
}
