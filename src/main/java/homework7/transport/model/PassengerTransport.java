package homework7.transport.model;

public class PassengerTransport extends LandTransport {
    private String bodyType;
    private int passengersNumber;

    public PassengerTransport(String brand, int horsePower, double maxSpeed, double weight, int wheelsNumber, double fuelConsumption, String bodyType, int passengersNumber) {
        super(brand, horsePower, maxSpeed, weight, wheelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersNumber = passengersNumber;
    }

    public void printInformation(double time) {
        System.out.printf("За время %f ч, автомобиль %s двигаясь с максимальной " +
                        "скоростью %f км/ч израсходует %f литров топлива\n",
                time, getBrand(), getMaxSpeed(), getFuelQuantity(time));
    }

    private double getFuelQuantity(double time) {
        return time * getMaxSpeed() * getFuelConsumption() / 100;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    @Override
    public String description() {
        return "PassengerTransport{" + super.description() +
                ", bodyType='" + bodyType + '\'' +
                ", passengersNumber=" + passengersNumber +
                '}';
    }
}
