package homework.homework7.additional;

public class Employee extends Person{
    private Posts post;

    public Employee(String name, String surname, Posts post) {
        super(name, surname);
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "post='" + post + '\'' +
                "} " + super.toString();
    }
}
