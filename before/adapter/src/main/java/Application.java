public class Application {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle(10, 10, 20, 20));
        drawing.addShape(new Circle(10, 10, 20));

        drawing.draw(new OldGraphicsFramework());
        drawing.drawNew(new NewGraphicsFramework());
    }
}
