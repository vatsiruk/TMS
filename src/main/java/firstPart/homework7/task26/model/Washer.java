package firstPart.homework7.task26.model;

public class Washer extends Appliance{
    private double maxCapacity;

    public Washer(boolean pluggedIn, double maxCapacity) {
        super("washing", "bathroom", pluggedIn);
        this.maxCapacity = maxCapacity;
    }

    public Washer(boolean pluggedIn) {
        super("washing", "bathroom", pluggedIn);
        this.maxCapacity = 5.5;
    }

    public Washer(double maxCapacity) {
        super("washing", "bathroom", false);
        this.maxCapacity = maxCapacity;
    }

    public Washer() {
        super("washing", "bathroom", false);
        this.maxCapacity = 5.5;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Washer{" +
                " purposeOfUse=" + getPurposeOfUse() +
                " locationInApartment=" + getLocationInApartment() +
                " isPluggedIn=" + isPluggedIn() +
                " maxCapacity=" + maxCapacity +
                '}';
    }
}
