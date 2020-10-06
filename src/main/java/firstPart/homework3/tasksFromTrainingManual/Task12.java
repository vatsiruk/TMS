package firstPart.homework3.tasksFromTrainingManual;

import java.util.Scanner;

public class Task12 {
    /*
    Найдите сумму первых n целых чисел, которые делятся на 3.
     */

    public static void main(String[] args) {
        int number = enterNumber();
        System.out.println("Сумма первых " + number + " целых чисел, которые делятся на 3: " + sum(number));
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static int sum(int number) {
        int result = 0;
        int currentNumber = 0;
        for (int i = 0; i < number; i++) {
            result += 3 + currentNumber;
            currentNumber += 3;
        }
        return result;
    }
}
