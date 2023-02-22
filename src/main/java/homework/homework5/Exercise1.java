package homework.homework5;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        char[][] array = new char[8][8];

        for (int i = 0; i <array.length; i += 2)
        {
            for (int j = 0; j < array.length; j += 2)
            {
                array[i][j] = 'W';
                array[i][j+1] = 'B';
            }
        }

        for (int i = 1; i <array.length; i += 2)
        {
            for (int j = 0; j < array.length; j += 2)
            {
                array[i][j] = 'B';
                array[i][j+1] = 'W';
            }
        }

        for (char[] chars : array) {
            System.out.println(Arrays.toString(chars));
        }
    }
}
