package homework2.tasksFromTrainingManual;

public class Task3 {
    /*
    Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    А) минут + секунд,
    В) часов + минут + секунд,
    С) дней + часов + минут + секунд,
    D) недель + дней + часов + минут + секунд.
     */
    public static void main(String[] args) {
        int seconds = 4500;
        System.out.println("4500 секунд это:");
        printTime(seconds);
    }

    private static void printTime(int givenSeconds) {
        int seconds = givenSeconds % 60;
        int minutes = givenSeconds / 60;
        System.out.println("A) " + minutes + " минут " + seconds + " секунд");
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println("B) " + hours + " часов " + minutes + " минут " + seconds + " секунд");
        int days = hours / 24;
        hours = hours % 60;
        System.out.println("C) " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");
        int weeks = days / 7;
        days = days % 24;
        System.out.println("D) " + weeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}