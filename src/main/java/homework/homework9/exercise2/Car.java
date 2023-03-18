package homework.homework9.exercise2;

public class Car {
    private String model;
    private String vin;
    private int year;

    public Car() {
    }

    public Car(String vin) {
        this.vin = vin;
    }

    public Car(String model, String vin, int year) {
        this.model = model;
        this.vin = vin;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                '}';
    }
}
