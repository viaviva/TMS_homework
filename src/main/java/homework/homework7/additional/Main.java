package homework.homework7.additional;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Hostel> hostels = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1) добавить студента
                    2) добавить сотрудника
                    3) добавить общежитие
                    4) заселить студента в общежитие
                    5) просмотр всех студентов
                    6) просмотр всех сотруников
                    else - выход""");

            switch (scanner.nextInt())
            {
                case 1:
                    System.out.println("введите имя, фамилию студента и группу:");
                    students.add(new Student(scanner.next(), scanner.next(), scanner.next()));
                    break;
                case 2:
                    System.out.println("выберите должность сотрудника: 1 - декан, 2 - заместитель декана, 3 - сотрудник кафедры, 4 - секретарь");
                    Posts post = null;
                    switch (scanner.nextInt())
                    {
                        case 1:
                            post = Posts.DEAN;
                            break;
                        case 2:
                            post = Posts.DEPUTY_DEAN;
                            break;
                        case 3:
                            post = Posts.DEPARTMENT_EMPLOYEE;
                            break;
                        case 4:
                            post = Posts.SECRETARY;
                            break;
                    }
                    System.out.println("введите имя и фамилию сотрудника:");
                    employees.add(new Employee(scanner.next(), scanner.next(), post));
                    break;
                case 3:
                    System.out.println("введите адрес, название и кол-во мест:");
                    hostels.add(new Hostel(scanner.next(), scanner.next(), new boolean[scanner.nextInt()]));
                    break;
                case 4:
                    for (Hostel hostel : hostels)
                    {
                        System.out.println((hostels.indexOf(hostel) + 1) + " " + hostel);
                    }

                    System.out.println("выберите общежитие, в которое хотите заселить:");
                    int numberOfHostel = scanner.nextInt() - 1;
                    hostels.get(numberOfHostel).freePlaces();
                    System.out.println("введите номер студент, которого хотите заселить:");
                    int numberOfStudent = scanner.nextInt() - 1;
                    System.out.println("введите номер комнаты, в которую хотите заселить:");
                    int numberOfRoom = scanner.nextInt() - 1;
                    hostels.get(numberOfHostel).takePlace(numberOfRoom);
                    students.get(numberOfStudent).settlement(numberOfRoom, hostels.get(numberOfHostel));
                    break;
                case 5:
                    for (Student student : students)
                    {
                        System.out.println((students.indexOf(student) + 1) + " " + student);
                    }
                    break;
                case 6:
                    for (Employee employee : employees)
                    {
                        System.out.println(employee);
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
