package Case_study_Resort_Old.Models;

import java.io.Serializable;

public class Villa extends Services implements Serializable {
    private String standardRoom;
    private String describeService;
    private String areaPool;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String standardRoom, String describeService, String areaPool, int numberFloor) {
        this.standardRoom = standardRoom;
        this.describeService = describeService;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String nameService, String areaService, int rentalPrice, int numberPeopleRental, String styleRental, String id, String standardRoom, String describeService, String areaPool, int numberFloor) {
        super(nameService, areaService, rentalPrice, numberPeopleRental, styleRental, id);
        this.standardRoom = standardRoom;
        this.describeService = describeService;
        this.areaPool = areaPool;
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }


    @Override
    public String showInfo() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", describeService='" + describeService + '\'' +
                ", areaPool='" + areaPool + '\'' +
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
