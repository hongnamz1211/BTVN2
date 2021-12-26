package com;

import java.util.Scanner;

public class Menu {
    private static final FamilyManager familyManager = new FamilyManager();
    private static final TownManager townManager = new TownManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Menu Town");
            System.out.println("2. Menu Family");
            System.out.println("--------------");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menuTown();
                    break;
                case 2:
                    menuFamily();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuTown() {
        int choice1;
        do {
            System.out.println("-----Menu Town -----");
            System.out.println("1. Thêm hộ gia đình");
            System.out.println("2. Hiển thị hộ gia đình");
            System.out.println("3. Hiển thị tất cả");
            System.out.println("0. Exit");
            System.out.println("--------------------");
            System.out.println("Nhập lựa chọn");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    townManager.createTown();
                    break;
                case 2:
                    System.out.println("Nhập số nhà");
                    int num = scanner.nextInt();
                    townManager.displayTown(num);
                    break;
                case 3:
                    townManager.displayAll();
                    break;
            }
        } while (choice1 != 0);
    }

    public static void menuFamily() {
        int choice2;
        do {
            System.out.println("-----Menu Family -----");
            System.out.println("1. Thêm người");
            System.out.println("2. Hiển thị tất cả người trong phố");
            System.out.println("3. Hiển thị tất cả người trong gia đình");
            System.out.println("4. Hiển thị các cụ trên 80 tủi");
            System.out.println("0. Exit");
            System.out.println("----------------------");
            System.out.println("Nhập lựa chọn");
            choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Nhập số nhà");
                    int num = scanner.nextInt();
                    Town town = townManager.getTown(num);
                    if (town != null) {
                        familyManager.createFamily(town);
                    } else {
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 2:
                    familyManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập số nhà");
                    int num3 = scanner.nextInt();
                    familyManager.displayHuman(num3);
                    break;
                case 4:
                    System.out.println("Danh sách các cụ trên 80 tủi");
                    familyManager.displayHumanOver80();
                    break;
            }
        } while (choice2 != 0);
    }
}
