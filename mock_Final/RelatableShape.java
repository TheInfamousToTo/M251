package mock_Final;


public abstract class RelatableShape implements Shape {
    protected double r;

    public RelatableShape(double r){
        this.r = r;
    }

    public RelatableShape() {
        this(1.0);
    }

    public boolean isBiggerThan(Shape s) {
        return this.area() > s.area();
    }

}
