package mock_Final;

public class TestShape {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(5);
        Cube c1 = new Cube(3);
        System.out.println("The area of s1 is: " + s1.area());
        System.out.println("area of c1 is:" + c1.area());
        System.out.println(s1.isBiggerThan(c1));
        System.out.println(guess("Tuesday"));
    }
    public static String guess(String s) {
        if (s.length() < 2)
            return "";
        else
            return guess(s.substring(2)) + s.charAt(0);

    }
}


