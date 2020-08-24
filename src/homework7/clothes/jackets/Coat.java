package homework7.clothes.jackets;

public class Coat implements IJacket{
    public Coat() {
    }

    @Override
    public void putOn() {
        System.out.println("Пальто надето");
    }

    @Override
    public void takeOff() {
        System.out.println("Пальто снято");
    }
}
