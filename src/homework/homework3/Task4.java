package homework.homework3;

import java.util.Scanner;

public class Task4 {
    /*
    4)Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.
     */
    public static void main(String[] args) {
        while (true) {
            printResult(enterNumber(), enterNumber());
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static void printResult(int firstNumber, int secondNumber) {
        int result = 0;
        for (int i = 1; i <= firstNumber; i++) {
            result += secondNumber;
        }
        System.out.println(firstNumber + "*" + secondNumber + "=" + result);
    }
}
