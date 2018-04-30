package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static com.sun.jmx.snmp.ThreadContext.contains;
import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseTraversers;


public class Main {

    //arrays storing user input data
    static ArrayList<String> houses = new ArrayList<>();
    static ArrayList<String> leaderBoard = new ArrayList<>();
    static LeaderBoard lBoard = new LeaderBoard();
    static House house = new House();
    static Event event = new Event();

    public static void main(String[] args) {

        //general use scanner
        Scanner s = new Scanner(System.in);

        //although null, needed to assign a variable
        String userInput = null;
        while (true) {
            System.out.println("MENU: 1)Events-2)Houses-"
                    + "3)LeaderBoard-4)Programme-5)Exit");
            String menu = s.next();
            if (menu.equals("1")) {
                //if statement logic for events
                System.out.println("MENU: 1)add event and years"
                        + "-2)show events-3)add result-4)show result");
                String events = s.next();
                String[] arrayOfEvents = new String[0];
                String reply;
                //if statement logic for Main menu
                if (events.equals("1")) {
                    event.addEvent();
                } else if (events.equals("2")) {
                    event.showEvents();
                } else if (events.equals("4")) {
                    event.showResults();
                } else if (events.equals("3")) {
                    event.addResults();
                }
            } else if (menu.equals("2")) {
                //if statememnt logic for houses
                System.out.println("MENU: 1)Add house-2)Show houses-"
                        + "3)Show year groups-4)Add year groups");
                String yards = s.next();
                if (yards.equals("1")) {
                    house.addHouse();
                } else if (yards.equals("2")) {
                    house.showHouse();
                } else if (yards.equals("3")) {
                    house.showYearGroup();
                } else if (yards.equals("4")) {
                    house.addYearGroup();
                }
            } else if (menu.equals("3")) {
                //if statement logic for laderboard
                System.out.println("MENU: 1)View Leaderboard-2)Add points"
                        + "-3)Show points");
                Scanner b = new Scanner(System.in);
                userInput = b.next();
                if (userInput.equals("1")) {
                    System.out.println(leaderBoard);
                } else if (userInput.equals("2")) {
                    lBoard.addPoints();
                } else if (userInput.equals("3")) {
                    lBoard.showPoints();
                }
            } else if (menu.equals("4")) {
                lBoard.readFile();
                //logic for ending the programme
            } else if (menu.equals("5")) {
                System.exit(0);
            } else {
                System.out.println("unknown command");
            }
        }
    }
}



