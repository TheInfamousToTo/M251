package Week2;

public class loop1 {
    public static void main(String[] args) {
        //print & multiplication
        for (int i = 1; i <= 70; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        // print A to Z
        for (char i = 'a'; i <= 'z'; i++){
            System.out.println(i);
        }

        // Arrays !
        int [] holder = {1,2,3,4,5,6,7,8,9,10};
        int [] hoolder = new int[10];
        for (int i = 0; i < holder.length; i++) {
            System.out.println("holder = "+holder[i]);
            System.out.println("holder size = "+holder.length);
            hoolder[i]=i;
            System.out.println("hoolder = "+hoolder[i]);
            System.out.println("hoolder size = "+hoolder.length);
        }
        //string and string build
        String str = "";
        for (int i = 1; i <= 10000; i++)
            str = str + "*";
        System.out.println(str);


        StringBuilder sb = new StringBuilder(10000);
        for (int i=1; i <= 10000; i++)
            sb.append("*");
        System.out.println(sb);


    }
}
