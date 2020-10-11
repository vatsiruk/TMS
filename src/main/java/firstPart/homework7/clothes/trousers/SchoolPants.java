package firstPart.homework7.clothes.trousers;

public class SchoolPants implements ITrousers{
    public SchoolPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Школьные штаны надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Школьные штаны сняты");
    }
}
