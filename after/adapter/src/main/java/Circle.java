public class Circle extends Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsFrameworkAdapter graphics) {
        graphics.drawCircle(x, y, radius);
    }
}
