package Week4;

public class c {
    public double radius;
    public c(){
        radius=10;
    }
    public c(double newRadius){
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
