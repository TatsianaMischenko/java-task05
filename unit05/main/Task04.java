package by.epam.unit05.main;

//Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

import java.util.Arrays;
import java.util.Random;

public class Task04 {

    public static void main(String[] args) {
        int m = 10;
        int[] mas = getArray(m);

        int sum1 = getArraySum(mas, 1);
        int sum2 = getArraySum(mas, 3);
        int sum3 = getArraySum(mas, 4);

        System.out.println("Сумма 1й последовательности равна: " + sum1);
        System.out.println("Сумма 2й последовательности равна: " + sum2);
        System.out.println("Сумма 3й последовательности равна: " + sum3);
    }

    private static int getArraySum(int[] mas, int idx) {
        int sum = 0;
        int[] newMas = Arrays.copyOfRange(mas, idx, idx+2);

        for (int i = 0; i < newMas.length; i++) {
            sum += newMas[i];
        }
        return sum;
    }

    private static int[] getArray(int m) {
        int[] mas = new int[m];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(999);
            System.out.println("mas = " + mas[i]);
        }
        return mas;
    }
}
