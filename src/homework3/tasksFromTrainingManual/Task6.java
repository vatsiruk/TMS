package homework3.tasksFromTrainingManual;

import java.util.Scanner;

public class Task6 {
    /*
    Создайте число. Определите, является ли число трехзначным. Определите, является
    ли его последняя цифра семеркой. Определите, является ли число четным.
     */
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите число: ");
            int number = inputNumber();
            System.out.println("Число трехзначное? " + isNumberThreeDigit(number));
            System.out.println("Последняя цифра числа 7? " + isSevenLastDigit(number));
            System.out.println("Число четное? " + isNumberEven(number));
        }
    }

    private static boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isSevenLastDigit(int number) {
        if (number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isNumberThreeDigit(int number) {
        if ((number % 1000) / 100 >= 1 && (number % 1000) / 100 < 10) {
            return true;
        } else {
            return false;
        }
    }


}
