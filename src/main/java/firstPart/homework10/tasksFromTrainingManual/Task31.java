package firstPart.homework10.tasksFromTrainingManual;

import java.util.ArrayList;
import java.util.Iterator;

/*
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
 */
public class Task31 {
    private static ArrayList<Integer> marks = new ArrayList<>();

    public static void main(String[] args) {
        generateMarksList(20);
        System.out.println("Оценки: " + marks);

        System.out.println("Наибольшая оценка: " + getHighestMark());
    }

    private static void generateMarksList(int numberOfStudents) {
        for(int i = 0; i < numberOfStudents; i++) {
            marks.add((int) (Math.random() * 10 + 1));
        }
    }

    private static Integer getHighestMark() {
        Iterator<Integer> iterator = marks.iterator();
        Integer highestMark = 0;

        while(iterator.hasNext()) {
            Integer nextMark = iterator.next();
            if(highestMark < nextMark) {
                highestMark = nextMark;
            }
        }

        return highestMark;
    }
}
