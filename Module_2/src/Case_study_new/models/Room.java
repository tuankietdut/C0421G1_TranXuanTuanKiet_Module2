package Case_study_new.models;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
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
}
