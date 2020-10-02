package homework10.tasksFromTrainingManual;

import java.util.ArrayList;
import java.util.Iterator;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Task29 {
    private static ArrayList<Integer> marks = new ArrayList<>();

    public static void main(String[] args) {
        generateMarksList(10);
        System.out.println("Все оценки: " + marks);

        deleteBadMarks();
        System.out.println("Положительные оценки: " + marks);
    }

    private static void generateMarksList(int studentsNumber) {
        for (int i = 0; i < studentsNumber; i++) {
            marks.add((int) (Math.random() * 10 + 1));
        }
    }

    private static void deleteBadMarks() {
        Iterator<Integer> iterator = marks.iterator();

        while (iterator.hasNext()) {
            Integer nextMark = iterator.next();
            if (nextMark < 4) {
                iterator.remove();
            }
        }
    }
}
