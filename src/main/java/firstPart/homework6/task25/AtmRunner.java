package firstPart.homework6.task25;

public class AtmRunner {
    /*
    Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
    банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
    50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
    снимающую деньги. На вход передается сумма денег. На выход – булевское
    значение (операция удалась или нет). При снятии денег функция должна
    рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
    конструктор с тремя параметрами – количеством купюр.
     */

    public static void main(String[] args) {
        Atm atm = new Atm(0, 0,3);
        System.out.println(atm);

        System.out.println(atm.isWithdrawMoney(60));
        System.out.println(atm);

        atm.addMoney(10, 10, 2);
        System.out.println(atm);

        System.out.println(atm.isWithdrawMoney(1260));
    }
}
