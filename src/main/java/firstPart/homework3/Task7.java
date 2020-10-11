package firstPart.homework3;

public class Task7 {
    /*
    7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
     */
    public static void main(String[] args) {
        printSum();
    }

    private static void printSum() {
        int result = 0;
        for (int i = 1; i <= 99; i += 2) {
            result += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99 = " + result);
    }
}
