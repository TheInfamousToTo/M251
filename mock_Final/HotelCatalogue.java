package mock_Final;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class HotelCatalogue {
    private HashMap<Integer, String> hotelMap;

    public HotelCatalogue() {
        hotelMap = new HashMap<Integer,String>();
    }

    public void addHotel() {
        hotelMap.put(101, "Radison Sas");
        hotelMap.put(102, "For Season");
        hotelMap.put(105, "Hayat Regency");
        hotelMap.put(107, "concord al-Salam");

    }

    public void brint() {
        for (Integer n : hotelMap.keySet())
            System.out.println(n + " " + hotelMap.get(n));
    }

    public void printHotel(int c) {
        System.out.println("The hotel for the code " + c + " is " + hotelMap.get(c));
    }

    public Set<String> allHotels() {
        Set<String> names = new TreeSet<String>();
        for (Integer n : hotelMap.keySet()) {
            names.add(hotelMap.get(n));
        }
        return names;
    }

    public void findAreaCode(String hotelName) {
        int count = 0;
        for (Integer n : hotelMap.keySet())
            if (hotelName.equals(hotelMap.get(n))) {
                System.out.println("The hotel Code for" + hotelName + "is " + n);
                count++;
            }
        if (count == 0)
            System.out.println("The hotel is not found in the catalogue");
    }

    public static void main(String[] args) {
        HotelCatalogue Catalogue = new HotelCatalogue();
        Catalogue.addHotel();
        Catalogue.brint();
        Catalogue.allHotels();
        Catalogue.printHotel(103);
        Catalogue.printHotel(105);
        System.out.println("hotel names are : "+Catalogue.allHotels());
        Catalogue.findAreaCode("For Season");
    }

}