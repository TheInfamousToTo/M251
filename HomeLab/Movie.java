package HomeLab;

import java.util.ArrayList;
import java.util.Scanner;
public class Movie {
    private String title;
    private int year;
    
    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String toString() {
        return "Title: " + title + " Year: " + year;
    }
    
    public double calcLateFees(int days) {
        return days * 2;
    }

}

class Comedy extends Movie {
    private int rating;
    
    public Comedy(String title, int year, int rating) {
        super(title, year);
        this.rating = rating;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public String toString() {
        return super.toString() + " Rating: " + rating;
    }
    
    public double calcLateFees(int days) {
        return days * 3;
    }
}

class MovieTest {
    public static void main(String[] args) {
        ArrayList<Movie> rentals = new ArrayList<Movie>();
        rentals.add(new Movie("Norm of the North", 2011));
        rentals.add(new Comedy("Kung Fu Panda 3", 2013, 5));
        for (Movie movie : rentals) {
            System.out.println(movie);
        }
        System.out.println("Total late fee: $" + lateFeesOwed(rentals));
    }
    
    public static double lateFeesOwed(ArrayList<Movie> rentals) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        for (Movie movie : rentals) {
            System.out.print("Enter the number of days late for " + movie.getTitle() + ": ");
            int days = input.nextInt();
            total += movie.calcLateFees(days);
        }
        return total;
    }
}








