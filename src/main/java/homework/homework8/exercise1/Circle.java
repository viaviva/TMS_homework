package homework.homework8.exercise1;

public class Circle implements Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}
