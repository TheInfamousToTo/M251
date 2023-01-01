package Week10;

import java.util.ArrayList;
import java.util.Iterator;

public class ExOfIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("mahmood");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Hussain");
        names.add("Fatima");
        for (String x: names)
            System.out.println(x);
        System.out.println("==================== with iterator ==============");

        Iterator<String> NameList = names.iterator();
        while (NameList.hasNext())
            System.out.println(NameList.next()+ ", ");

    }
}
