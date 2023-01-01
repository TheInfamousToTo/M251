package HomeLab;

public class Test1 {
    public static void main(String[] args) {
        int [] test = new int[9];
        int [] test1 = {1,2,3,4,5,6,7,8,9};
        int multi=4;
        for (int i = 1; i <= test.length-1; i++) {
            test[i]=i*i;
            System.out.println("RAM ="+test[i]);
            multi=test[i];
            //multi++;
            //System.out.println("test1="+test1[i]);
        }


    }
}
