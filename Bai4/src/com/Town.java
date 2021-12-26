package com;

public class Town {
    private int amountOfPeople;
    private int houseNumber;

    public Town() {
    }

    public Town(int amountOfPeople, int houseNumber) {
        this.amountOfPeople = amountOfPeople;
        this.houseNumber = houseNumber;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Town{" +
                ", amountOfPeople=" + amountOfPeople +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
