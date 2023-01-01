package Week10;

import java.util.*;

public class ExOfSet {
    public static void main(String[] args) {
        //Set<String> names= new HashSet<String>();
        //Set<String> names= new TreeSet<String>();
        Set<String> names = new LinkedHashSet<String>();
        names.add("Mahmood");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Hussain");
        names.add("Fatima");
        Iterator<String> NameList = names.iterator();
        while (NameList.hasNext())
            System.out.println(NameList.next());


    }
}
