package homework.homework9.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parking {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static ArrayList<Car> getCars() {
        return cars;
    }

    public static void setCars(Car car) {
        cars.add(car);
        System.out.println("машина добавлена!");
    }

    public static Car checkCar(String vin) throws NoVinException
    {
        for (int i = 0; i < cars.size(); i++)
        {
            if (cars.get(i).getVin().equals(vin))
            {
                return cars.get(i);
            }
        }
        throw new NoVinException("нету машин с таким номером");
    }

    public static int countByYears(int years)
    {
        int count = 0;
        for (int i = 0; i < cars.size(); i++)
        {
            if (cars.get(i).getYear() <= LocalDate.now().getYear() - years) {
                count++;
                System.out.println(cars.get(i).toString());
            }
        }
        return count;
    }
}
