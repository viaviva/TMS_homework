package homework.homework3.additional;

import java.util.Arrays;
import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        int buf;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if (array[j] > array[j+1])
                {
                    buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
