package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinatesInfo;
    private String place;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinatesInfo() {
        return coordinatesInfo;
    }

    public void setCoordinatesInfo(String coordinatesInfo) {
        this.coordinatesInfo = coordinatesInfo;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
