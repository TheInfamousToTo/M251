package Week10;

import java.util.*;

public class ExOfBulkOperations {
    public static void main(String[] args) {
        Integer[] Vals1 = {1,2,3,7};
        Integer[] Vals2 = {2,5,3};
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(Vals1));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(Vals2));
        Set<Integer> s1= new LinkedHashSet<Integer>(list1);
        Set<Integer> s2= new LinkedHashSet<Integer>(list2);
        Iterator<Integer> LoopList1 = s1.iterator();
        Iterator<Integer> LoopList2 = s2.iterator();
        System.out.println("========== Element of Set 1 ==========");
        while (LoopList1.hasNext())
            System.out.print(LoopList1.next()+ ",");
        System.out.println();
        System.out.println("========== Element of Set 2 ==========");
        while (LoopList2.hasNext())
            System.out.print(LoopList2.next()+ ",");
        // the below 4 codes cant run all off them at once,so you need to Disable 2 of the to run the 3rd
        System.out.println();
        System.out.println("========== Union of Set 1 & 2 ==========");
        s1.addAll(s2); // to be closed in order for intersection to work
        for (Integer x:s1)
            System.out.print(x+",");
        s1.retainAll(s2); // to be closed in order for remove all to work
        System.out.println();
        System.out.println("========== intersection of Set 1 & 2 ==========");
        for (Integer x:s1)
            System.out.print(x+",");
        s1.removeAll(s2);// to be closed in order for the others to work
        System.out.println();
        System.out.println("========== remove all  of Set 1  ==========");
        for (Integer x:s1)
            System.out.print(x+",");
        s2.removeAll(s1);// to be closed in order for the others to work
        System.out.println();
        System.out.println("========== remove all  of Set 2 ==========");
        for (Integer x:s2)
            System.out.print(x+",");
    }
}
