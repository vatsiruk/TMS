package homework7.task26.model;

public class Plate extends Appliance {
    private int burnersNumber;

    public Plate(boolean pluggedIn, int burnersNumber) {
        super("cooking", "kitchen", pluggedIn);
        this.burnersNumber = burnersNumber;
    }

    public Plate(boolean pluggedIn) {
        super("cooking", "kitchen", pluggedIn);
        this.burnersNumber = 4;
    }

    public Plate(int burnersNumber) {
        super("cooking", "kitchen", false);
        this.burnersNumber = burnersNumber;
    }

    public Plate() {
        super("cooking", "kitchen", false);
        burnersNumber = 4;
    }

    public int getBurnersNumber() {
        return burnersNumber;
    }

    public void setBurnersNumber(int burnersNumber) {
        this.burnersNumber = burnersNumber;
    }

    @Override
    public String toString() {
        return "Plate{" +
                " purposeOfUse=" + getPurposeOfUse() +
                " locationInApartment=" + getLocationInApartment() +
                " isPluggedIn=" + isPluggedIn() +
                " burnersNumber=" + burnersNumber +
                '}';
    }
}
