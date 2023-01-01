package mock_Final;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
public class Flight {
    private int flightNo;
    private ArrayList<Passenger> passengers;

    public Flight(int flightNo) {
        this.flightNo = flightNo;
        passengers = new ArrayList<>();
    }


    public void addPassenger(Passenger p) {
        if (passengers.contains(p))
            System.out.println("Passenger cannot be added twice to the flight");
        else {
            passengers.add(p);
            System.out.println("Passenger has been added successfully to the flight");
        }
    }

    public String oldestPassenger() {
        String oldestName = null; //or ""
        int maxAge = -1;
        for (Passenger p : passengers) {
            if (p.getAge() > maxAge) {
                maxAge = p.getAge();
                oldestName = p.getName();
            }
        }
        return oldestName;
    }


    public void saveIntoFile(String fileName) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.println(flightNo);
        for (Passenger p : passengers) {
            out.println(p);
            out.close();
        }
    }// class
}

