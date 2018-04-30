package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.company.Main.houses;
import static com.sun.jmx.snmp.ThreadContext.contains;

public class Event {
    private String[] arrayOfEvents;
    private ArrayList events;
    private ArrayList yearsRacing;
    private ArrayList<String> position;
    private String[] arrayOfPositions;
    //Although unused, removal may break code



    public void addEvent() {
        Scanner scan = new Scanner(System.in);

        //same logic as the house functions
        //use of event/house.add(arrayofevents[i]) isn't liked

        System.out.println("How many events would you like");
        int numOfEvents = Integer.parseInt(scan.nextLine());

        arrayOfEvents = new String[numOfEvents];
        for (int i = 0; i < arrayOfEvents.length; i++) {
            System.out.println("enter event in preferred order " + (i + 1) + ": ");
            arrayOfEvents[i] = scan.nextLine();
            //events.add(arrayOfEvents[i]);


        }

        //just printing the inputs
        for (int i = 0; i < arrayOfEvents.length; i++) {
            System.out.println("Event " + (i + 1) + " : ");
            System.out.println(arrayOfEvents[i] + "\n");
            System.out.println(Arrays.toString(arrayOfEvents));
            System.out.println("--------------------------");
        }


        Scanner scanning = new Scanner(System.in);

        System.out.println("Enter the number of Years taking part");
        int numOfYearGroupsInRace = Integer.parseInt(scan.nextLine());

        String arrayOfYearsRacing[] = new String[numOfYearGroupsInRace];
        for (int i = 0; i < arrayOfYearsRacing.length; i++) {
            System.out.println("enter Years in preferred order " + (i + 1) + ": ");
            arrayOfYearsRacing[i] = scanning.nextLine();
            //yearsRacing.add(arrayOfYearsRacing[i]);
        }

        for (int i = 0; i < arrayOfYearsRacing.length; i++) {
            System.out.println("Year " + (i + 1) + " : ");
            System.out.println(arrayOfYearsRacing[i] + "\n");
            System.out.println(yearsRacing);
            System.out.println("--------------------------");
        }
        System.out.println("race will be run by years " + Arrays.toString(arrayOfYearsRacing));
    }

    public void addResults() {

        //same logic as the others
        Scanner scanning = new Scanner(System.in);
        System.out.println("These are your events " + Arrays.toString(arrayOfEvents));
        System.out.println("Which event do you want to add a result to");
        String places = scanning.next();
        if (Arrays.toString(arrayOfEvents).contains(places)) {
            Scanner scan = new Scanner(System.in);

            System.out.println("How many houses took part");
            int numOfPositions = Integer.parseInt(scan.nextLine());

            String[] arrayOfPositions = new String[numOfPositions];
            for (int i = 0; i < arrayOfPositions.length; i++) {
                System.out.println("enter house and position " + (i + 1) + ": ");
                arrayOfPositions[i] = scan.nextLine();
                //position.add(arrayOfPositions[i]);
                System.out.println(position);
            }

            for (int i = 0; i < arrayOfPositions.length; i++) {
                System.out.println("House " + (i + 1) + " : ");
                System.out.println(arrayOfPositions[i] + "\n");
            }

        }
    }
    public void showResults() {
        System.out.println(Arrays.toString(arrayOfPositions));
    }

    public void showEvents() {
        System.out.println(Arrays.toString(arrayOfEvents));
    }
}

