package com;

import java.util.ArrayList;
import java.util.Scanner;

public class TownManager {
    ArrayList<Town> towns;
    Scanner scanner = new Scanner(System.in);

    public TownManager() {
        this.towns = new ArrayList<>();
    }

    public Town createTown() {
        System.out.println("Nhập số người trong gia đình");
        int amountOfPeople = scanner.nextInt();
        System.out.println("Nhập số nhà");
        int houseNumber = scanner.nextInt();
        for (Town t :
                towns) {
            if (t.getHouseNumber() == houseNumber) {
                System.out.println("Trùng số nhà, nhập lại");
                return null;
            }
        }
        Town town = new Town(amountOfPeople, houseNumber);
        towns.add(town);
        return town;
    }

    public void displayTown(int houseNumber) {
        Town town = null;
        for (Town t :
                towns) {
            if (t.getHouseNumber() == houseNumber) {
                town = t;
            }
        }
        if (town != null) {
            System.out.println(town);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    public void displayAll() {
        for (Town t :
                towns) {
            System.out.println(t);
        }
    }

    public Town getTown(int houseNumber) {
        Town town =null;
        for (Town t :
                towns) {
            if (t.getHouseNumber() == houseNumber) {
                town = t;
            }
        }
        return town;
    }
}
