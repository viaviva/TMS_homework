package homework.homework8.exercise1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Circle(2.0);
        figures[1] = new Rectangle(2.0, 1.0);
        figures[2] = new Triangle(2.0, 2.0, 3.0);
        figures[3] = new Circle(3.0);
        figures[4] = new Rectangle(4.0, 2.0);


        double general_perimeter = 0;
        for (Figure figure : figures)
        {
            System.out.println(figure.perimeter());
            general_perimeter += figure.perimeter();
        }
        System.out.println(general_perimeter);
    }
}
