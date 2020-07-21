package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    /*
    Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
     */
    public static void main(String[] args) {
        while (true) {
            printNumberOfPositiveAndNegativeNumbers(enterNumbers());
        }
    }

    private static List<Integer> enterNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите " + (i + 1) + " число: ");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    private static void printNumberOfPositiveAndNegativeNumbers(List<Integer> numbers) {
        int counterOfPositiveNumbers = 0;
        int counterOfNegativeNumbers = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                counterOfPositiveNumbers++;
            }
            if (numbers.get(i) < 0) {
                counterOfNegativeNumbers++;
            }
        }

        System.out.println(
                "Количество положительных чисел: " + counterOfPositiveNumbers
                        + "Количество отрицательных чисел: " + counterOfNegativeNumbers
        );
    }
}