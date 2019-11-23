package org.launchcode.safehouse.models;

import java.util.ArrayList;

public class HouseData {

    static ArrayList<House> houses = new ArrayList<>();

    public static ArrayList<House> getAll() {
        return houses;
    }

    public static void add(House newHouse) {
        houses.add(newHouse);
    }

    public static void remove(int id) {
        House houseToRemove = getById(id);
        houses.remove(houseToRemove);
    }

    public static House getById(int id) {
        House theHouse = null;

        for (House candidateHouse : houses) {
            if (candidateHouse.getHouseId() == id) {
                theHouse =candidateHouse;
            }
        }
        return theHouse;
    }
}
