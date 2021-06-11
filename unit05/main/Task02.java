package by.epam.unit05.main;
//Написать метод(методы) для нахождения суммы большего и меньшего из
//трех чисел
import java.util.Arrays;
import java.util.Random;

public class Task02 {

    public static void main(String args[]) {

        int[] mas = getArray();
        int max = getMaxNumberFromArray(mas);
        int min = getMinNumberFromArray(mas);
        int sum = getSum(min, max);
        System.out.println(Arrays.toString(mas) + " sum = " + sum);


    }

    private static int getSum(int min, int max) {
        return min + max;
    }

    private static int getMinNumberFromArray(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }

    private static int getMaxNumberFromArray(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        return max;
    }

    private static int[] getArray() {
        int[] mas = new int[3];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        return mas;
    }
}


