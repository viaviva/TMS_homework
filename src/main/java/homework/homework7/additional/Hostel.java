package homework.homework7.additional;

import java.util.Arrays;

public class Hostel {
    private String address;
    private String name;
    private boolean[] rooms;

    public Hostel() {
    }

    public Hostel(String address, String name, boolean[] rooms) {
        this.address = address;
        this.name = name;
        this.rooms = rooms;
    }

    public void freePlaces()
    {
        System.out.println("свободные места:");
        for (int i = 0; i < rooms.length; i++)
        {
            if (!rooms[i])
            {
                System.out.println(i+1);
            }
        }
    }

    public void takePlace(int index)
    {
        if (!rooms[index])
        {
            rooms[index] = true;
            System.out.println("место " + (index + 1) + " занято!");
        }
        else
        {
            System.out.println("место уже кем-то занято!");
        }
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
