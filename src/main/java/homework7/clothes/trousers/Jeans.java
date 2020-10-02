package homework7.clothes.trousers;

public class Jeans implements ITrousers {
    public Jeans() {
    }

    @Override
    public void putOn() {
        System.out.println("Джинсы надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Джинсы сняты");
    }
}
