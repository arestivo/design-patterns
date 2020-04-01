import frameworkA.GraphicsFrameworkA;
import frameworkB.GraphicsFrameworkB;

public class Rectangle extends Shape {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(GraphicsFrameworkB graphics) {
        graphics.drawRectangle(x, y, width, height);
    }

    @Override
    public void draw(GraphicsFrameworkA graphics) {
        graphics.drawRectangleShape(x, y, x + width, y + height);
    }
}
