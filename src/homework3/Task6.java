package homework3;

public class Task6 {
    /*
    6)Напишите программу вывода всех четных чисел от 2 до 100 включительно
     */
    public static void main(String[] args) {
        System.out.println("Четные числа от 2 до 100");
        printResult();
    }

    private static void printResult() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
