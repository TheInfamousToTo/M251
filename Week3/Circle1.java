package Week3;

public class Circle1 {
    public double radius;
    public Circle1(){
        radius=10;
    }
    public Circle1(double newRadius){
        radius=newRadius;
    }
    public double getArea(){
        return Math.PI* radius * radius;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
