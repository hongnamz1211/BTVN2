package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class FamilyManager {
    ArrayList<Family> families;
    Scanner scanner = new Scanner(System.in);

    public FamilyManager() {
        this.families = new ArrayList<>();
    }

    public void createFamily(Town town) {
        System.out.println("Nhập tên");
        String name = scanner.next();
        System.out.println("Nhập ngày sinh");
        String date = scanner.next();
        LocalDate dateOfBirth = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println("Nhập nghề nghiệp");
        String job = scanner.next();
        Family family = new Family(name, dateOfBirth, job, town);
        families.add(family);
    }

    public void displayAll() {
        for (Family f :
                families) {
            System.out.println(f);
        }
    }

    public void displayHuman(int houseHumber) {
        Family family = null;
        for (Family f :
                families) {
           if (f.getTown().getHouseNumber() == houseHumber) {
               family = f;
           }
        }
        if (family != null) {
            System.out.println(family);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    public void displayHumanOver80() {
        boolean check = false;
        for (Family f :
                families) {
            if (LocalDate.now().getYear() - f.getDateOfBirth().getYear() >= 80) {
                check = true;
                System.out.println(f);
            }
        }
        if (!check) {
            System.out.println("Khum có cụ nào trên 80 tủi");
        }
    }
}
