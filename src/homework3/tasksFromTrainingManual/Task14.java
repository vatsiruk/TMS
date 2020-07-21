package homework3.tasksFromTrainingManual;

public class Task14 {
    /*
    Создать массив оценок произвольной длины, вывести максимальную и
    минимальную оценку, её (их) номера.
     */
    public static void main(String[] args) {
        int[] array = getArray();
        printArray(array);
        int[] arrayOfResults = getResults(array);
        System.out.println(
                "Максимальная оценка: " + arrayOfResults[0] + ". Её номер: " + arrayOfResults[1]
                        + "\nМинимальная оценка: " + arrayOfResults[2] + ". Её номер: " + arrayOfResults[3]);
    }

    private static int[] getArray() {
        int[] array = new int[(int) (Math.random() * 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static int[] getResults(int[] array) {
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
        return new int[] {maxValue, maxValueIndex, minValue, minValueIndex};
    }
}
