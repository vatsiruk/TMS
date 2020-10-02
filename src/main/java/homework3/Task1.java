package homework3;

public class Task1 {
    /*
    1)Начав тренировки, спортсмен в первый день пробежал 10 км.
    Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
    Какойсуммарный путь пробежит спортсмен за 7 дней?
     */
    public static void main(String[] args) {
        double distance = 10;
        printDistance(distance);
    }
    private static void printDistance(double distance) {

        double result = distance;
        for (int i = 1; i < 7; i++) {
            distance *= 1.1;
            result += distance;
        }
        System.out.println("Пройденная дистанция за неделю: " + result);
    }
}
