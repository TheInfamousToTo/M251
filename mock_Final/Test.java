package mock_Final;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        Flight myFlight = new Flight(251);

        Passenger p1 = new Passenger("12345", "Hani", 23);
        Passenger p2 = new Passenger("12346", "Huda", 40);
        myFlight.addPassenger(p1);
        myFlight.addPassenger(p2);

        System.out.println(myFlight.oldestPassenger());

        myFlight.saveIntoFile("M251.txt");
        fun(12345);

    }
    static void fun(int n)
    {
        if (n == 0)
            return;
        System.out.println(n%10);
        fun(n/10);
    }
}
