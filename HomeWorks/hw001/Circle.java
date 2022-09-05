public class Circle extends Shapes {
    private int radius;
    protected Circle(Color color, Point centerPoint, int rad){
        super(color, centerPoint);
        setRadius(rad);
    }
    public void setRadius(int rad) {
        this.radius = rad;
        super.setArea(area());
    }
    @Override
    protected double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
