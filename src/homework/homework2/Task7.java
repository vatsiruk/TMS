package homework.homework2;

import java.util.Scanner;

public class Task7 {
    /*
    В переменную записываете количество программистов.
    В зависимости от количества программистов необходимо вывести правильно окончание.
    Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
     */
    public static void main(String[] args) {
        while (true) {
            printNumberOfProgrammers(enterNumber());
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число программистов: ");
        return scanner.nextInt();
    }

    private static void printNumberOfProgrammers(int number) {
        int remainderOfDivisionBy100 = number % 100;
        int remainderOfDivisionBy10 = number % 10;

        if (remainderOfDivisionBy10 == 1 && remainderOfDivisionBy100 != 11) {
            System.out.println(number + " программист.");
        } else if ((remainderOfDivisionBy10 >= 2 && remainderOfDivisionBy10 <= 4)
                && !(remainderOfDivisionBy100 >= 12 && remainderOfDivisionBy100 <= 14)) {
            System.out.println(number + " программиста.");
        } else {
            System.out.println(number + " программистов.");
        }
    }
}