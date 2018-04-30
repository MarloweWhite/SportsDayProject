package com.company;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseTraversers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.company.Main.houses;

public class House {

    private String house;
    private int year;
    private String[] arrayOfHouses;
    private ArrayList years;
    private String[] arrayOfYearGroups;


    public House() {
        this.house = house;
        this.year = year;
        this.arrayOfHouses = arrayOfHouses;
        this.years = years;
        this.arrayOfYearGroups = arrayOfYearGroups;
    }

    public String getHouse() {
        return house;
    }

    public int getYear() {
        return year;
    }
    
    public void addYearGroup() {
        Scanner scans = new Scanner(System.in);
        System.out.println("How many Year Groups would you like");
        int numOfYearGroups = Integer.parseInt(scans.nextLine());
        //how many they ask for it will produce this many

        arrayOfYearGroups = new String[numOfYearGroups];
        for (int i = 0; i < arrayOfYearGroups.length; i++) {
            System.out.println("enter Year Group " + (i + 1) + ": ");
            arrayOfYearGroups[i] = scans.nextLine();
            System.out.println(years);
            //prints out how many they previously entered
        }

        for (int i = 0; i < arrayOfYearGroups.length; i++) {

            System.out.println("Year Group " + (i + 1) + " : ");
            System.out.println(arrayOfYearGroups[i] + "\n");

        }
    }

    public void showHouse() {
        System.out.println(houses);
    }

    public void showYearGroup() {
        System.out.println(Arrays.toString(arrayOfYearGroups));
    }

    public void addHouse() {
        //similair to the last function

        Scanner scan = new Scanner(System.in);

        System.out.println("How many houses would you like");
        int numOfHouses = Integer.parseInt(scan.nextLine());

        arrayOfHouses = new String[numOfHouses];
        for (int i = 0; i < arrayOfHouses.length; i++) {
            System.out.println("enter house name " + (i + 1) + ": ");
            arrayOfHouses[i] = scan.nextLine();
            houses.add(arrayOfHouses[i]);
            System.out.println(houses);
        }

        for (int i = 0; i < arrayOfHouses.length; i++) {
            System.out.println("House " + (i + 1) + " : ");
            System.out.println(arrayOfHouses[i] + "\n");
        }


        System.out.println("You have added " + arrayOfHouses.length + " houses called " + houses);
        System.out.println("Have you added all your houses?");
        String decisionn = scan.next();
        if (decisionn.equals("yes")) {
            System.out.println("MENU: events-houses-LeaderBoard-exit");
        } else {
            System.out.println("error");
        }
    }

}


