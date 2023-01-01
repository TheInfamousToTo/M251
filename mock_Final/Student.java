package mock_Final;
import java.io.File;
import java.util.*;

public class Student {
    private Map<String , Integer> index;
    public Student(){
        index =new HashMap<String,Integer>(index);
    }
    public void FillUp(String Filename)throws Exception{
        File myfile= new File(Filename);
        Scanner s = new Scanner(myfile);

        while(s.hasNext()){
            String name=s.next();
            int grade=s.nextInt();

            index.put(name,grade);

        }
        s.close();
    }
    public void brint(){
        for(String ss:index.keySet())
            System.out.println("key:"+ss+" Value:"+index.get(ss));
    }
    public double average(){
        double sum=0;
        for(String ss:index.keySet())
            sum=sum+index.get(ss);
        return sum/index.size();

    }

    public static void main(String[] args) throws Exception{
        Student st = new Student();
        st.FillUp("Data.txt");
        st.brint();
        System.out.println("Average="+st.average());
    }
}
