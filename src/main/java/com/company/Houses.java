package com.company;

import java.util.Scanner;

public class Houses {

    private String[] house;
    private String[] year;

    public void addHouse() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many houses would you like");
        int numOfHouses = Integer.parseInt(scan.nextLine());

        String[] arrayOfHouses = new String[numOfHouses];
        for (int i = 0; i < arrayOfHouses.length; i++) {
            System.out.println("enter house name " + (i + 1) + ": ");
            arrayOfHouses[i] = scan.nextLine();
        }

        for (int i = 0; i < arrayOfHouses.length; i++) {
            System.out.println("House " + (i + 1) + " : ");
            System.out.println(arrayOfHouses[i] + "\n");

        }

        house = arrayOfHouses;
    }

    public void addYear() {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many Year Groups would you like");
        int numOfYearGroups = Integer.parseInt(scan.nextLine());

        String arrayOfYearGroups[] = new String[numOfYearGroups];
        for (int i = 0; i < arrayOfYearGroups.length; i++) {
            System.out.println("enter Year Group " + (i + 1) + ": ");
            arrayOfYearGroups[i] = scan.nextLine();
        }

        for (int i = 0; i < arrayOfYearGroups.length; i++) {
            System.out.println("Year Group " + (i + 1) + " : ");
            System.out.println(arrayOfYearGroups[i] + "\n");

        }

        year = arrayOfYearGroups;

    }

    public String[] getHouse() {
        return house;
    }

    public String[] getYear() {
        return year;
    }
}