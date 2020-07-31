package homework7.transport.model;

public class FreightTransport extends LandTransport {
    private int liftingCapacity;

    public FreightTransport(String brand, int horsePower, double maxSpeed, double weight, int wheelsNumber, double fuelConsumption, int liftingCapacity) {
        super(brand, horsePower, maxSpeed, weight, wheelsNumber, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public void printLoadingStatus(double cargo) {
        if (cargo <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "brand=" + getBrand() +
                ", horsePower=" + getHorsePower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", wheelsNumber=" + getWheelsNumber() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", liftingCapacity=" + liftingCapacity +
                ", power=" + getPower() +
                '}';
    }
}
