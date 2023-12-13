package org.example.homework.third.exfive;

import java.util.Arrays;

public class City {
    private final String name;
    private final House[] houses;

    @Override
    public String toString() {
        return "Город: " + name + '\''
                + ", Дом: " + Arrays.toString(houses)
                + '}';
    }

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        House[] obj = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            obj[i] = new House(houses[i].getNumber(), houses[i].getStreetName());
        }
        return obj;
    }

}
