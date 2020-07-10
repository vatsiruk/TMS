package homework.homework3.tasksFromTrainingManual;

public class Task15 {
    /*
    Создать массив, заполнить его случайными элементами, распечатать,
    перевернуть, и снова распечатать (при переворачивании нежелательно создавать
    еще один массив).
     */
    public static void main(String[] args) {
        int[] array = getArray();
        printArray(array);
        printInvertedArray(array);
    }

    private static int[] getArray() {
        int[] array = new int[(int) (Math.random() * 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    private static void printInvertedArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < (array.length + 1) / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        printArray(array);
    }
}
