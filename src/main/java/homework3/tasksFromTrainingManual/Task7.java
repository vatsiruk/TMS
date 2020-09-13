package homework3.tasksFromTrainingManual;

import java.util.Scanner;

public class Task7 {
    /*
    Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
    полностью закрыть круглой картонкой радиусом r.
     */
    public static void main(String[] args) {
        while (true) {
            double a = inputNumber('a');
            double b = inputNumber('b');
            double r = inputNumber('r');
            System.out.println("Можно ли закрыть отверстие? "
                    + (Math.sqrt(a * a + b * b) <= r));
        }
    }

    private static double inputNumber(Character symbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите " + symbol + ": ");
        return scanner.nextDouble();
    }
}
