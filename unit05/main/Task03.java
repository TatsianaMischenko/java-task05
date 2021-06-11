package by.epam.unit05.main;

//Написать метод(методы), определяющий, в каком из данных двух чисел
//больше цифр

public class Task03 {

    public static void main(String[] args) {
        int num1 = 98984587;
        int num2 = 763436564;
        int longest = getLongestNumber(num1,num2);
        System.out.println("longest number is  " + longest);

    }

    public static int getLongestNumber(int num1, int num2) {
        int len1 = getNumberOfDigits(num1);
        int len2 = getNumberOfDigits(num2);

        if (len1 > len2) {
            return num1;
        } else if (len1 == len2) {
            System.out.println("Both number are of the same length");
            return num1;
        }
        return num2;
    }

    public static int getNumberOfDigits(int num) {
        return String.valueOf(num).length();
    }
}
