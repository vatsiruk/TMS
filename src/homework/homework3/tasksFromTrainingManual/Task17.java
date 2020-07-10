package homework.homework3.tasksFromTrainingManual;

import java.util.Scanner;

public class Task17 {
    /*
    Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
    таким образом:
    1 1 1 1 1
    0 1 1 1 0
    0 0 1 0 0
    0 1 1 1 0
    1 1 1 1 1
     */
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите размерность массива: ");
            int arrayDimension = getArrayDimension();
            printArray(getArray(arrayDimension));
        }
    }

    private static int getArrayDimension() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[][] getArray(int dimension) {
        int[][] array = new int[dimension][dimension];
        for (int i = 0; i < dimension + 1 / 2; i++) {
            for (int j = i; j < dimension - i; j++) {
                array[i][j] = 1;
                array[dimension - 1 - i][j] = 1;
            }
        }
        return array;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
