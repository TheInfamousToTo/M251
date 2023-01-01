package MOCK_MTA;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    private String title;
    private int year;
    Movie(String title, int year){
        this.title=title;
        this.year=year;
    }
    public String getTitle(){
        return title;
    }
    private int getYear(){
        return year;
    }
    private void setTitle(String title){
        this.title=title;
    }
    private void setYear(int year){
        this.year=year;
    }
    @Override
    public String toString(){
        return "title:"+title+ " year : " + year;
    }
    public int calcLateFees(int days){
        //int latefees;
       // latefees=days*2;
        //System.out.println("late fees : "+latefees+ "$");
        return days*2;
    }

   /* public static void main(String[] args) {
        Movie a= new Movie("kkk", 1999);
        Movie b= new Movie("abc", 2000);


    }*/

}
class Comedy extends Movie{
    private int rating;
    //private String title;
    //private int year;

    Comedy(String title, int year, int rating) {
        super(title, year);
        this.rating=rating;
    }

    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    @Override
    public String toString(){
        return super.toString()+" Rating : "+ rating;
    }
    public int calcLateFees(int days){
        //int latefees;
        //latefees=days*3;
        //System.out.println("late fees : "+latefees+ "$");
        return days*3;
    }

}
class MovieTest {
    public static void main(String[] args) {
        ArrayList<Movie> rent = new ArrayList<Movie>();
        rent.add(new Movie("abc", 2020));
        rent.add(new Comedy("milf", 2022, 10));
        for (Movie movie : rent) {
            System.out.println(movie);
        }
        System.out.println("total late fee: $" + lateFeesOwed(rent));

    }

    public static double lateFeesOwed(ArrayList<Movie> rent) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        for (Movie movie : rent) {
            System.out.println("Enter the number of days late for " + movie.getTitle() + ":");
            int days = input.nextInt();
            total += movie.calcLateFees(days);
        }
        return total;
    }
}

//public class MovieTest{}

