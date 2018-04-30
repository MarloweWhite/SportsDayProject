package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.company.Main.houses;

public class LeaderBoard {
    private ArrayList points;
    private String house;
    int counter = 1;
    private ArrayList events;
    private ArrayList<String> position;
    private HashMap<Integer, String> showingPoints;
    private HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

    public LeaderBoard() {
        this.points = points;
        this.house = house;
        this.counter = counter;
        this.events = events;
        this.position = position;
    }

    public void addPoints() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("These are your houses " + houses);
            System.out.println("Which house do you want to add points to");
            String place = scanner.next();
            if (houses.contains(place)) {
                System.out.println("What position did the house come");
                String positions = scanner.next();
                if (positions.equals("1")) {
                    hashMap.put(4, place);

                } else if (positions.equals("2")) {
                    hashMap.put(3, place);

                } else if (positions.equals("3")) {
                    hashMap.put(2, place);;

                } else if (positions.equals("4")) {
                    hashMap.put(1, place);;

                } else {
                    hashMap.put(0, place);
                } for (Map.Entry m:hashMap.entrySet()) {
                    System.out.println(m.getKey() + " " +m.getValue());
                }
            }
        }

    public void showPoints() {
        System.out.println(hashMap);
        System.out.println("In order of point entry ");
    }

    public void readFile() {
            String csvFile = "C:/Users/c1722696/Documents/SportsdayProject/src/main/java/com/company/progEvents.csv";
            String line = "";
            String csvSplitBy = ",";
            String time;
            String location;
            String event;
            String year;

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null) {
                    if (counter == 1) {
                        System.out.println("Programme of events: \n");
                        counter += 1;
                        //this will remove the heading in the csv file so only data
                    } else {
                        String[] datas = line.split(csvSplitBy);
                        time = datas[0];
                        location = datas[1];
                        event = datas[2];
                        year = datas[3];

                        System.out.println(time + ": " + event + " - " + location + " - Year " + year);

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

