package mock_Final;

public class Sphere extends RelatableShape {
    public Sphere(double r) {
        super(r);
    }

    public double area() {
        return 4 * Math.PI * r * r;
    }
}
