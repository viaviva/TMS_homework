package homework.thirdHomework.additional;

import java.util.Arrays;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i+=2)
        {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
