package firstPart.homework7.clothes.jackets;

public class WinterJacket implements IJacket{
    public WinterJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Зимняя куртка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Зимняя куртка снята");
    }
}
