package homework3;

public class Task2 {
    /*
    2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
    Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {
        printAmoebaQuantity();
    }

    private static void printAmoebaQuantity() {
        int amoebaQuantity = 1;
        for (int time = 3; time <= 24; time += 3) {
            amoebaQuantity *= 2;
            System.out.println("Через " + time + " часа будет " + amoebaQuantity + " амеб.");
        }
    }
}
