package homework.homework2.tasksFromTrainingManual;

import java.util.Scanner;

public class Task4 {
    /*
    Определить число, полученное выписыванием в обратном порядке цифр
    любого 4-х значного натурального числа n.
     */
    public static void main(String[] args) {
        while (true) {
            printDeterminedNumber(enterNumber());
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static void printDeterminedNumber(int number) {
        int firstNumber = number % 10;
        int secondNumber = (number - firstNumber) % 100 / 10;
        int thirdNumber = (number - secondNumber) % 1000 / 100;
        int fourthNumber = (number - thirdNumber) % 10000 / 1000;
        int resultNumber = firstNumber * 1000 + secondNumber * 100 + thirdNumber * 10 + fourthNumber;
        System.out.println("Полученное число: " + resultNumber);
    }
}