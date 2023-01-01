package Week3;

import org.w3c.dom.ls.LSInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        double mark1 , mark2 , mark3 , marks=0.0;
        String results;
        Scanner s=new  Scanner(System.in);
        System.out.println("enter your TMA marks : ");
        mark1 = s.nextDouble();
        System.out.println("enter your MID marks : ");
        mark2 = s.nextDouble();
        System.out.println("enter your FINALS marks : ");
        mark3 = s.nextDouble();
        marks = mark1+mark2+mark3;
        if (marks>=90 && marks<=100)
           results= "your Grade is A";
        else if( marks>=80 && marks<90)
            results= "your Grade is B";
        else if( marks>=70 && marks<80)
            results="your Grade is C";
        else if( marks>=0 && marks<70)
            results="your Grade is F";
        else
            results="wrong input, please try again ! ";

        System.out.println("=============================================");
        System.out.println(" your TMA Marks : "+ mark1);
        System.out.println(" your MID Marks : "+ mark2);
        System.out.println(" your Final Marks : "+ mark3);
        System.out.println(" your TOTAL Marks : "+ marks);
        System.out.println(" your Grade is  : "+ results);
    }
}
