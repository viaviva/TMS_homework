package homework.homework7.exercise1;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public static void receiveCall(String name, String number)
    {
        System.out.println("Звонит " + name + "по номеру " + number);
    }

    public static void sendMessage(String ...str)
    {
        System.out.println(Arrays.toString(str));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
