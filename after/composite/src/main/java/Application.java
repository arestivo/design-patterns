public class Application {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Rectangle rectangle = new Rectangle(10, 20, 30, 40);
        Circle circle1 = new Circle(10, 20, 5);
        Circle circle2 = new Circle(5, 5, 10);

        drawing.addShape(rectangle);
        drawing.addShape(circle1);
        drawing.addShape(circle2);

        rectangle.move(-5, -5);

        drawing.draw();
    }
}
