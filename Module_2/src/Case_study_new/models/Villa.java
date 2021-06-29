package Case_study_new.models;

public class Villa extends Facility {

    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa(String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental) {
        super(nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
    }

    public Villa() {
    }

    public Villa(String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor) {
        super(nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Villa(String standardVilla, double areaPool, int floor) {
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }
}
