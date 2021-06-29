package Case_study_Resort_Old.Models;

import java.io.Serializable;

public class House extends Services implements Serializable {
    private String standardRoom;
    private String describeService;
    private int numberFloor;


    public House(String standardRoom, String describeService, int numberFloor) {
        this.standardRoom = standardRoom;
        this.describeService = describeService;
        this.numberFloor = numberFloor;
    }

    public House(String nameService, String areaService, int rentalPrice, int numberPeopleRental, String styleRental, String id, String standardRoom, String describeService, int numberFloor) {
        super(nameService, areaService, rentalPrice, numberPeopleRental, styleRental, id);
        this.standardRoom = standardRoom;
        this.describeService = describeService;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescribeService() {
        return describeService;
    }

    public void setDescribeService(String describeService) {
        this.describeService = describeService;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfo() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", describeService='" + describeService + '\'' +
                ", numberFloor='" + numberFloor + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaService='" + areaService + '\'' +
                ", rentalPrice=" + rentalPrice +
                ", numberPeopleRental=" + numberPeopleRental +
                ", styleRental='" + styleRental + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
