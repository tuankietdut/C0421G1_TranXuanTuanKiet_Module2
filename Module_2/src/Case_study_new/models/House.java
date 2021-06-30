package Case_study_new.models;

public class House extends Facility{
    private String standardHose;
    private int floor;
    private static final String NAME = "House";

    public House( double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHose, int floor) {
        super(NAME, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHose = standardHose;
        this.floor = floor;
    }

    public House(String standardHose, int floor) {
        this.standardHose = standardHose;
        this.floor = floor;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "standardHose='" + standardHose + '\'' +
                ", floor=" + floor +
                '}';
    }
}
