package homework7.transport.model;

public abstract class Transport {
    private String brand;
    private int horsePower;
    private double maxSpeed;
    private double weight;

    public Transport(String brand, int horsePower, double maxSpeed, double weight) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getWeight() {
        return weight;
    }


    protected double getPower() {
        return 0.74 * getHorsePower();
    }
}
