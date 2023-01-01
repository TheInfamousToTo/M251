package Week3;

public class TestCircule1 {
    public static void main(String[] args) {
        Circle1 test= new Circle1();
        System.out.println("Radius of circle test : "+ test.radius);
        System.out.println("Area of circle test : "+ test.getArea());
        System.out.println("Area of circle test : "+ test.getPerimeter());
        test.setRadius(55);
        System.out.println("Radius of circle test : "+ test.radius);
        System.out.println("Area of circle test : "+ test.getArea());
        System.out.println("Area of circle test : "+ test.getPerimeter());

    }
}
