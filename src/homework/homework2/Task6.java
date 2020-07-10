package homework.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    /*
    Даны 2 числа. Вывести большее из них
     */
    public static void main(String[] args) {
        while (true) {
            List<Integer> numbers = enterNumbers();
            System.out.println("Наибольшее число: " + Math.max((numbers.get(0)), numbers.get(1)));
        }
    }

    private static List<Integer> enterNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите " + (i + 1) + " число: ");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}