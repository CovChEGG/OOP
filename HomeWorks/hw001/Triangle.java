/*
    Double a = 2D, b = 3D, c = 4D;
    Double p = (a + b + c)/2;
    Double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
*/
public class Triangle extends Shapes {
    private Point point2;
    private Point point3;

    protected Triangle(Color color, Point mainPoint1, Point point2, Point point3) {
        super(color, mainPoint1);
        setPoints(point2, point3);
    }

    @Override
    protected double area() {
        double a = Point.distance(super.mainPoint, point2);
        double b = Point.distance(super.mainPoint, point3);
        double c = Point.distance(point2, point3);
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public void setPoints(Point p2, Point p3) {
        super.setArea(area());
        this.point2 = p2;
        this.point3 = p3;
    }
}
