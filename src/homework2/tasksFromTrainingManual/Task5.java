package homework2.tasksFromTrainingManual;

import java.util.*;

public class Task5 {
    /*
    Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
    различны?
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println(areDigitsDifferent(enterNumber()));
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    private static boolean areDigitsDifferent(int number) {
        //1-ый способ
        int firstNumber = number % 10;
        int secondNumber = (number - firstNumber) % 100 / 10;
        int thirdNumber = (number - secondNumber) % 1000 / 100;
        int fourthNumber = (number - thirdNumber) % 10000 / 1000;

        if ((firstNumber == secondNumber) || (firstNumber == thirdNumber) || (firstNumber == fourthNumber)) {
            return false;
        } else if ((secondNumber == thirdNumber) || (secondNumber == fourthNumber)) {
            return false;
        } else if (thirdNumber == fourthNumber) {
            return false;
        } else {
            return true;
        }
    }
    /*
    //2-ой способ
    private static boolean areDigitsDifferent(int number) {
        List<Integer> digits = new ArrayList<>();

        digits.add(number % 10);
        digits.add((number - digits.get(0)) % 100 / 10);
        digits.add((number - digits.get(1)) % 1000 / 100);
        digits.add((number - digits.get(2)) % 10000 / 1000);

        Set<Integer> set = new LinkedHashSet<>(digits);

        return set.size() == 4;
    }
    */
}