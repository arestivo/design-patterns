public class Rectangle extends Shape {
    private double topLeftX;
    private double topLeftY;
    private double width;
    private double height;

    public Rectangle(double topLeftX, double topLeftY, double width, double height) {
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.width = width;
        this.height = height;
    }

    public double getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(double topLeftX) {
        this.topLeftX = topLeftX;
    }

    public double getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(double topLeftY) {
        this.topLeftY = topLeftY;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("RECTANGLE: " + topLeftX + ", " + topLeftY + ", " + width + ", " + height);
    }

    @Override
    public void move(double deltaX, double deltaY) {
        this.topLeftX += deltaX;
        this.topLeftY += deltaY;
    }
}
