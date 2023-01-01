package mock_Final;

import java.util.HashMap;

public class averagePass {
    public averagePass(HashMap<String, Integer> marks) {
        int sum = 0;
        int count = 0;
        for (String id : marks.keySet())
            if (marks.get(id) >= 50) {
                sum += marks.get(id);
                count++;
            }
        double average = (double) sum / count;
        System.out.println("Average mark = " + average);
    }
}


