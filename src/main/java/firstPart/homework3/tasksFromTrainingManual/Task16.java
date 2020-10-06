package firstPart.homework3.tasksFromTrainingManual;

public class Task16 {
    /*
    Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.
     */
    public static void main(String[] args) {
        int[] array = getArray();
        printArray(array);
        printResult(getIndexesOfMaxAndMinValues(array), array);
    }

    private static int[] getArray() {
        int[] array = new int[(int) (Math.random() * 20 + 3)];
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

    private static int[] getIndexesOfMaxAndMinValues(int[] array) {
        int maxValue = array[0];
        int maxValueIndex = 0;
        int minValue = array[0];
        int minValueIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
            if (array[i] <= minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }
        return new int[] {maxValueIndex, minValueIndex};
    }

    private static void printResult(int[] indexes, int[] array) {
        int upperIndex;
        int lowerIndex;
        if (indexes[0] > indexes[1]) {
            upperIndex = indexes[0];
            lowerIndex = indexes[1];
        } else {
            upperIndex = indexes[1];
            lowerIndex = indexes[0];
        }

        int result = 0;
        for (int i = lowerIndex + 1; i < upperIndex; i++) {
            result += array[i];
        }

        System.out.println("Сумма элементов одномерного массива, "
                + "расположенных между минимальным и максимальным значениями: " + result);
    }
}
