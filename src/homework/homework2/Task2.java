package homework.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    /*
    Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей.
    Определить существует ли такой треугольник.
    Дано: a, b, c –стороны предполагаемого треугольника.
    Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
    Если хотя бы в одном случае отрезококажется больше суммы двух других,
    то треугольника с такими сторонами несуществует.
     */
    public static void main(String[] args) {
        while (true) {
            printExistenceOfTriangle(enterSides());
        }
    }

    private static List<Double> enterSides() {
        List<Double> sides = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите " + (i + 1) + " сторону: ");
            sides.add(scanner.nextDouble());
        }
        return sides;
    }

    private static void printExistenceOfTriangle(List<Double> sides) {
        if (sides.get(0) + sides.get(1) > sides.get(2)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}