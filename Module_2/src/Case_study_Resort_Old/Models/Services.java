package Case_study_Resort_Old.Models;

public abstract class Services {
    public String nameService;
    public String areaService;
    public int rentalPrice;
    public int numberPeopleRental;
    public String styleRental;
    public String id;

    public Services() {
    }

    public Services(String nameService, String areaService, int rentalPrice, int numberPeopleRental, String styleRental, String id) {
        this.nameService = nameService;
        this.areaService = areaService;
        this.rentalPrice = rentalPrice;
        this.numberPeopleRental = numberPeopleRental;
        this.styleRental = styleRental;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaService() {
        return areaService;
    }

    public void setAreaService(String areaService) {
        this.areaService = areaService;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getNumberPeopleRental() {
        return numberPeopleRental;
    }

    public void setNumberPeopleRental(int numberPeopleRental) {
        this.numberPeopleRental = numberPeopleRental;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    public abstract String showInfo();
}
