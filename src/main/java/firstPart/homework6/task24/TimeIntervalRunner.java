package firstPart.homework6.task24;

public class TimeIntervalRunner {
    /*
    Создать класс и объекты описывающие промежуток времени. Сам промежуток
    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    Сделать методы для получения полного количества секунд в объекте, сравнения
    двух объектов (метод должен работать аналогично compareTo в строках). Создать
    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    по отдельности. Сделать метод для вывода данных.
     */
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(3660);
        TimeInterval timeInterval2 = new TimeInterval(1, 1, 0);
        TimeInterval timeInterval3 = new TimeInterval(3661);

        System.out.println(timeInterval1);
        System.out.println(timeInterval2);
        System.out.println(timeInterval3);

        System.out.println(timeInterval3.compareTo(timeInterval2));
        System.out.println(timeInterval2.compareTo(timeInterval1));
        System.out.println(timeInterval2.compareTo(timeInterval3));

    }
}
