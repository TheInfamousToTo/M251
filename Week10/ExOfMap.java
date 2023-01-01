package Week10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExOfMap {
    public static void main(String[] args) {
        Map<Integer, String> StdRcd= new HashMap<Integer, String>();
        StdRcd.put(6200486,"Hussain");
        StdRcd.put(6200487,"Ali");
        StdRcd.put(6200488,"Maki");
        StdRcd.put(6200489,"Ahmed");
        System.out.println(StdRcd.get(6200486));
        System.out.println(StdRcd.get(6200487));
        System.out.println(StdRcd.get(6200488));
        System.out.println(StdRcd.get(6200489));
        System.out.println(StdRcd.get(6200486));
        Set<Integer> StdKey = StdRcd.keySet();
        for (Integer x: StdKey)
            System.out.println(x+"--->"+ StdRcd.get(x));


    }
}
