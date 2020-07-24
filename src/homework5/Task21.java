package homework5;

public class Task21 {
    /*
    Напишите три цикла выполняющих многократное сложение строк, один с
    помощью оператора сложения и String, другой с помощью StringBuilder и метода
    append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

    Ответ: StringBuilder быстрее всего
     */
    public static void main(String[] args) {
        String[] strings = {
                "1stString ",
                "2ndString ",
                "3rdString ",
                "4thString ",
                "5thString"
        };

        System.out.println("Время выполнения с помощью String и сложения: " + firstAddition(strings));
        System.out.println("Время выполнения с помощью StringBuilder и append: " + secondAddition(strings));
        System.out.println("Время выполнения с помощью StringBuffer и append: " + thirdAddition(strings));
    }

    private static long firstAddition(String[] strings) {
        long time = System.nanoTime();
        String result = "";
        for (String string : strings) {
            result += string;
        }
        return System.nanoTime() - time;
    }

    private static long secondAddition(String[] strings) {
        long time = System.nanoTime();
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string);
        }
        return System.nanoTime() - time;
    }

    private static long thirdAddition(String[] strings) {
        long time = System.nanoTime();
        StringBuffer result = new StringBuffer();
        for (String string : strings) {
            result.append(string);
        }
        return System.nanoTime() - time;
    }
}
