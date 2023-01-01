package mock_Final;

public class Cube extends RelatableShape {
    public Cube(double r) {
        super(r);
    }

    public double area() {
        return 6 * r * r;
    }
}
