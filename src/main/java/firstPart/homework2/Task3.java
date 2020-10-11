package firstPart.homework2;

import java.util.Scanner;

public class Task3 {
    /*
    Дано целое число.
    Если оно является положительным, то прибавить к нему 1.
    Если отрицательным, то вычесть из него 2.
    Если нулевым, то заменить его на 10. Вывести полученное число.
     */
    public static void main(String[] args) {
        while (true) {
            implementOperation(enterNumber());
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static void implementOperation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        System.out.println("Полученное число равно " + number);
    }
}