import java.util.ArrayList;
import java.util.List;

public class Group extends Shape {
    private List<Shape> shapes;

    public Group() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        System.out.println("GROUP:");
        for (Shape shape : shapes) {
            System.out.print(" - ");
            shape.draw();
        }
    }

    @Override
    public void move(double deltaX, double deltaY) {
        for (Shape shape : shapes)
            shape.move(deltaX, deltaY);
    }
}
