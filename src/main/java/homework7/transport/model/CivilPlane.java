package homework7.transport.model;

public class CivilPlane extends AirTransport {
    private int passengersNumber;
    private boolean businessClassAvailability;

    public CivilPlane(String brand, int horsePower, double maxSpeed, double weight, double wingspan, int minRunwayLengthForTakeoff, int passengersNumber, boolean businessClassAvailability) {
        super(brand, horsePower, maxSpeed, weight, wingspan, minRunwayLengthForTakeoff);
        this.passengersNumber = passengersNumber;
        this.businessClassAvailability = businessClassAvailability;
    }

    public void printPassengerCapacityStatus(int passengersNumber) {
        if (this.passengersNumber >= passengersNumber) {
            System.out.println("Мест хватило на всех");
        } else {
            System.out.println("Не хватает мест");
        }
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public boolean isBusinessClassAvailability() {
        return businessClassAvailability;
    }

    @Override
    public String description() {
        return "CivilPlane{" + super.description() +
                ", passengersNumber=" + passengersNumber +
                ", businessClassAvailability=" + businessClassAvailability +
                '}';
    }
}
