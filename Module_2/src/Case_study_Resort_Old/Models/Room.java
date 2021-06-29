package Case_study_Resort_Old.Models;

import java.io.Serializable;

public class Room extends Services implements Serializable {

    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, String areaService, int rentalPrice, int numberPeopleRental, String styleRental, String id, String freeService) {
        super(nameService, areaService, rentalPrice, numberPeopleRental, styleRental, id);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }


    @Override
    public String showInfo() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaService='" + areaService + '\'' +
                ", rentalPrice=" + rentalPrice +
                ", numberPeopleRental=" + numberPeopleRental +
                ", styleRental='" + styleRental + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
