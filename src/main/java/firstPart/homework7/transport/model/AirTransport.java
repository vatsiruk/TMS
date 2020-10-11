package firstPart.homework7.transport.model;

public abstract class AirTransport extends Transport {
    private double wingspan;
    private int minRunwayLengthForTakeoff;

    public AirTransport(String brand, int horsePower, double maxSpeed, double weight, double wingspan, int minRunwayLengthForTakeoff) {
        super(brand, horsePower, maxSpeed, weight);
        this.wingspan = wingspan;
        this.minRunwayLengthForTakeoff = minRunwayLengthForTakeoff;
    }

    public double getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLengthForTakeoff() {
        return minRunwayLengthForTakeoff;
    }

    @Override
    public String description() {
        return super.description() +
                ", wingspan=" + wingspan +
                ", minRunwayLengthForTakeoff=" + minRunwayLengthForTakeoff;
    }
}
