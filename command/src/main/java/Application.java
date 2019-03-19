public class Application {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Rectangle rectangle = new Rectangle(10, 20, 30, 40);
        Circle circle1 = new Circle(10, 20, 5);
        Circle circle2 = new Circle(5, 5, 10);

        Group group = new Group();
        group.addShape(rectangle);
        group.addShape(circle1);

        drawing.addShape(group);
        drawing.addShape(circle2);

        group.move(-5, -5);

        drawing.draw();
    }
}
