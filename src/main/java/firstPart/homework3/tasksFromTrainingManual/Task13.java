package firstPart.homework3.tasksFromTrainingManual;

import java.util.Random;

public class Task13 {
    /*
    Создать последовательность случайных чисел, найти и вывести наибольшее
    из них.
     */
    public static void main(String[] args) {
        int[] array = getArray();
        printArray(array);
        System.out.println("\nНаибольшее значение в массиве: " + getMaxValue(array));

    }

    private static int[] getArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
