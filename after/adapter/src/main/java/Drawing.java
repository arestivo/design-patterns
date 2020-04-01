import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        shapes = new ArrayList<>();
    }

    public void draw(GraphicsFrameworkAdapter graphics) {
        for (Shape shape : shapes)
            shape.draw(graphics);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
