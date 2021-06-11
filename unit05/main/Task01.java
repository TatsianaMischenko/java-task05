package by.epam.unit05.main;

//Написать метод(методы) для нахождения наибольшего общего делителя и
//наименьшего общего кратного двух натуральных чисел

public class Task01 {

    public static void main(String args[]) {

        int a = 6;
        int b = 18;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Наибольший общий делитель = " + nod(a, b) + ", Наименьшее общее кратное = " + nok(a, b));
    }

    static int nod(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            d = a + b;
        }
        return d;
    }

    static int nok(int a, int b) {
        int nod = nod(a, b);
        if (nod == 0) {
            System.out.println("Деление на 0 не возможно");
            return 0;
        }
        return a * b / nod;
    }
}

