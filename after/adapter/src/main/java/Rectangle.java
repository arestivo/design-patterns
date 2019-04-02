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
    public void draw(OldGraphicsFramework graphics) {
        graphics.drawRectangle(x, y, width, height);
    }

    @Override
    public void drawNew(NewGraphicsFramework graphics) {
        graphics.doARectangle(x, y, x + width, y + height);
    }
}
