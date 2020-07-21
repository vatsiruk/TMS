package homework3;

public class Task5 {
    /*
    5)Напишите программу печати таблицы перевода расстояний
    из дюймов всантиметры для значений длин от 1 до 20 дюймов.
    1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        printResult();
    }

    private static void printResult() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " дюйм = " + 2.54 * i + " см.");
        }
    }
}
