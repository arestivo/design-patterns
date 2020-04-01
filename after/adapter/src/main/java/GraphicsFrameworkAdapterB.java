import frameworkB.GraphicsFrameworkB;

public class GraphicsFrameworkAdapterB implements GraphicsFrameworkAdapter {
    private GraphicsFrameworkB graphics;

    public GraphicsFrameworkAdapterB(GraphicsFrameworkB graphics) {
        this.graphics = graphics;
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        graphics.drawRectangle(x, y, width, height);
    }

    @Override
    public void drawCircle(double x, double y, double radius) {
        drawCircle(x, y ,radius);
    }
}
