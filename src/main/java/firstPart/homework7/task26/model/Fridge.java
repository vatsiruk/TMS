package firstPart.homework7.task26.model;

public class Fridge extends Appliance {
    private double temperature;

    public Fridge(boolean pluggedIn, double temperature) {
        super("food storage", "kitchen", pluggedIn);
        this.temperature = temperature;
    }

    public Fridge(boolean pluggedIn) {
        super("food storage", "kitchen", pluggedIn);
        this.temperature = 8;
    }

    public Fridge(double temperature) {
        super("food storage", "kitchen", false);
        this.temperature = temperature;
    }

    public Fridge() {
        super("food storage", "kitchen", false);
        temperature = 8;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                " purposeOfUse=" + getPurposeOfUse() +
                " locationInApartment=" + getLocationInApartment() +
                " isPluggedIn=" + isPluggedIn() +
                " temperature=" + temperature +
                '}';
    }
}
