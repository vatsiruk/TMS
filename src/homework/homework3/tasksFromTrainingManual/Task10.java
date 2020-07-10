package homework.homework3.tasksFromTrainingManual;

public class Task10 {
    /*
    Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
     */
    public static void main(String[] args) {
        int lowerBorder = 10;
        int upperBorder = 15;
        printCalculatedNumber(lowerBorder, upperBorder);
    }

    private static void printCalculatedNumber(int lowerBorder, int upperBorder) {
        int result = 0;
        for (int i = lowerBorder; i <= upperBorder; i++) {
            if (i == lowerBorder) {
                result = lowerBorder;
            } else {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
