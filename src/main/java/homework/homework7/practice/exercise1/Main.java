package homework.homework7.practice.exercise1;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek[] days = DaysOfWeek.values();

        for (DaysOfWeek day : days)
        {
            System.out.println(day);
            if (day == DaysOfWeek.SUNDAY || day == DaysOfWeek.SATURDAY)
            {
                System.out.println("WEEKEND\n");
            }
            else
            {
                System.out.println("WEEKDAY\n");
            }
        }
    }
}
