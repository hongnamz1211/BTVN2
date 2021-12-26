package com;

import java.time.LocalDate;

public class Family {
    private String name;
    private LocalDate dateOfBirth;
    private String job;
    private Town town;

    public Family() {
    }

    public Family(String name, LocalDate dateOfBirth, String job, Town town) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", job='" + job + '\'' +
                ", town=" + town +
                '}';
    }
}
