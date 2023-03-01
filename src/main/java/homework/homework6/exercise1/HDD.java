package homework.homework6.exercise1;

public class HDD
{
    String name;
    int volume;
    String type;

    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
