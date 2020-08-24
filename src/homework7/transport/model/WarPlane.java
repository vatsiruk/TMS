package homework7.transport.model;

public class WarPlane extends AirTransport {
    private int missilesNumber;
    private boolean ejectionSystemAvailability;

    public WarPlane(String brand, int horsePower, double maxSpeed, double weight, double wingspan, int minRunwayLengthForTakeoff, int missilesNumber, boolean ejectionSystemAvailability) {
        super(brand, horsePower, maxSpeed, weight, wingspan, minRunwayLengthForTakeoff);
        this.missilesNumber = missilesNumber;
        this.ejectionSystemAvailability = ejectionSystemAvailability;
    }

    public void launchMissile() {
        if (missilesNumber > 0) {
            System.out.println("Ракета пошла...");
            missilesNumber--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public int getMissilesNumber() {
        return missilesNumber;
    }

    public void eject() {
        if (ejectionSystemAvailability == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public String description() {
        return "WarPlane{" + super.description() +
                "missilesNumber=" + missilesNumber +
                ", ejectionSystemAvailability=" + ejectionSystemAvailability +
                '}';
    }
}
