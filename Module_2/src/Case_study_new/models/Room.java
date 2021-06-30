package Case_study_new.models;

public class Room extends Facility {
    private String freeService;
    private final static String NAME = "Room";

    public Room(double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(NAME, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
