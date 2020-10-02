package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    /*
    Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
     */
    public static void main(String[] args) {
        while (true) {
            printNumberOfPositiveNumbers(enterNumbers());
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

    private static void printNumberOfPositiveNumbers(List<Integer> numbers) {
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                counter++;
            }
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + counter);
    }
}