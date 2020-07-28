package homework7.task26.model;

public abstract class Appliance {
    private String purposeOfUse;
    private String locationInApartment;
    private boolean isPluggedIn = false;

    public Appliance(String purposeOfUse, String locationInApartment, boolean pluggedIn) {
        this.purposeOfUse = purposeOfUse;
        this.locationInApartment = locationInApartment;
        this.isPluggedIn = pluggedIn;
    }

    public void plugIn() {
        isPluggedIn = true;
    }

    public void unplug() {
        isPluggedIn = false;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public String getLocationInApartment() {
        return locationInApartment;
    }

    public String getPurposeOfUse() {
        return purposeOfUse;
    }
}
