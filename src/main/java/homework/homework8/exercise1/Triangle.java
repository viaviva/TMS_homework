package homework.homework8.exercise1;

public class Triangle implements Figure{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public double square() {
        double semiPer = perimeter() / 2;
        return Math.sqrt(semiPer * (semiPer - firstSide) * (semiPer - secondSide) * (semiPer - thirdSide));
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
