import frameworkA.GraphicsFrameworkA;

public class GraphicsFrameworkAdapterA implements GraphicsFrameworkAdapter {
    private GraphicsFrameworkA graphics;

    public GraphicsFrameworkAdapterA(GraphicsFrameworkA graphics) {
        this.graphics = graphics;
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        graphics.drawRectangleShape(x, y, x + width, y + height);
    }

    @Override
    public void drawCircle(double x, double y, double radius) {
        graphics.drawEllipseShape(x, y, radius, radius);
    }
}
