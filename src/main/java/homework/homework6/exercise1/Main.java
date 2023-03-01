package homework.homework6.exercise1;

public class Main
{
    public static void main(String[] args) {
        Computer computer1 = new Computer(100.1f, "acer");
        System.out.println(computer1);
        Computer computer2 = new Computer(234.5f, "asus",
                                            new RAM("intel", 16),
                                            new HDD("kingstone", 120, "external"));
        System.out.println(computer2);
    }
}
