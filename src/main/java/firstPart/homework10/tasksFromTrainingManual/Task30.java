package firstPart.homework10.tasksFromTrainingManual;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
 */
public class Task30 {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        generateNumbersInList(20);
        System.out.println(list);

        deleteRepeatingNumbers();
        System.out.println(list);
    }

    private static void generateNumbersInList(int listSize) {
        for(int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
    }

    private static void deleteRepeatingNumbers() {
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
