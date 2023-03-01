package homework.homework6.exercise1;

public class Computer
{
    float cost;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(float cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(float cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
