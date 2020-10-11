package firstPart.homework3.tasksFromTrainingManual;

import java.util.Scanner;

public class Task11 {
    /*
    Имеется целое число, определить является ли это число простым, т.е.
    делится без остатка только на 1 и себя.
     */

    public static void main(String[] args) {
        while(true) {
            System.out.println(isNumberPrime(enterNumber()));
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static boolean isNumberPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
