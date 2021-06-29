package Case_study_new.models;

public class House extends Facility{
    private String standardHose;
    private int floor;

    public House(String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHose, int floor) {
        super(nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHose = standardHose;
        this.floor = floor;
    }

    public House(String standardHose, int floor) {
        this.standardHose = standardHose;
        this.floor = floor;
    }

    public House() {
    }
}
