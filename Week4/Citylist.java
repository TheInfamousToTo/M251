package Week4;

import java.util.ArrayList;
import java.util.Collections;

public class Citylist {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        System.out.println(cityList);
        System.out.println("List size= " + cityList.size());
        System.out.println("Is Miami in the list? :"+ cityList.contains("Miami"));
        System.out.println("The location of Denver in the list?   " + cityList.indexOf("Denver"));
        cityList.add(4, "Paris");
        cityList.remove ("Paris");




    }
}
