package org.example.homework.third.exfive;

public final class House {
    private int number;
    private String streetName;

    public House(int number, String streetName) {
        this.number = number;
        this.streetName = streetName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Номер: " + number
                + ", Улица: '" + streetName + '\''
                + '}';
    }

}
