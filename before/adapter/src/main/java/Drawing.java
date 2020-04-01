import frameworkA.GraphicsFrameworkA;
import frameworkB.GraphicsFrameworkB;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        shapes = new ArrayList<>();
    }

    public void draw(GraphicsFrameworkB graphics) {
        for (Shape shape : shapes)
            shape.draw(graphics);
    }

    public void draw(GraphicsFrameworkA graphics) {
        for (Shape shape : shapes)
            shape.draw(graphics);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
