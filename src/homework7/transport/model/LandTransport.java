package homework7.transport.model;

public abstract class LandTransport extends Transport{
    private int wheelsNumber;
    private double fuelConsumption;

    public LandTransport(String brand, int horsePower, double maxSpeed, double weight, int wheelsNumber, double fuelConsumption) {
        super(brand, horsePower, maxSpeed, weight);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String description() {
        return super.description() +
                ", wheelsNumber=" + wheelsNumber +
                ", fuelConsumption=" + fuelConsumption ;
    }
}
