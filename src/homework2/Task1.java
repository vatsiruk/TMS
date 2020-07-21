package homework2;

import java.util.Scanner;

public class Task1 {
    /*
    В переменную записываем число.
    Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    Например, "этооднозначное положительное число".
    Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более.
     */
    public static void main(String[] args) {
        while (true) {
            int inputNumber = enterNumber();
            printNumberStatus(inputNumber);
            printNumberOfDigits(inputNumber);
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static void printNumberStatus(int number) {
        if (number > 0) {
            System.out.print("Это число положительное. ");
        } else if (number < 0) {
            System.out.print("Это число отрицательное. ");
        } else {
            System.out.print("Это число равно 0. Оно однозначное.");
            System.exit(0);
        }
    }

    private static void printNumberOfDigits(int number) {
        if (Math.abs(number / 10) < 1) {
            System.out.println("Оно однозначное.");
        } else if (Math.abs(number / 100) < 1) {
            System.out.println("Оно двухзначное.");
        } else {
            System.out.println("Оно имеет три или более разрядов.");
        }
    }
}