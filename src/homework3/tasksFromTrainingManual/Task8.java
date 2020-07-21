package homework3.tasksFromTrainingManual;

import java.util.Random;

public class Task8 {
    /*
    Имеется целове число (задать с помощью Random rand = new Random(); int x =
    rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
    нему слово «рублей» в правильном падеже.
     */
    public static void main(String[] args) {
        printNumberOfRubles(generateNumber());
    }

    private static int generateNumber() {
        Random random = new Random();
        return Math.abs(random.nextInt());
    }

    private static void printNumberOfRubles(int number) {
        int remainderOfDivisionBy100 = number % 100;
        int remainderOfDivisionBy10 = number % 10;

        if (remainderOfDivisionBy10 == 1 && remainderOfDivisionBy100 != 11) {
            System.out.println(number + " рубль.");
        } else if ((remainderOfDivisionBy10 >= 2 && remainderOfDivisionBy10 <= 4)
                && !(remainderOfDivisionBy100 >= 12 && remainderOfDivisionBy100 <= 14)) {
            System.out.println(number + " рубля.");
        } else {
            System.out.println(number + " рублей.");
        }
    }
}
