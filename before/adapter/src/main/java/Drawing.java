import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        shapes = new ArrayList<>();
    }

    public void draw(OldGraphicsFramework graphics) {
        for (Shape shape : shapes)
            shape.draw(graphics);
    }

    public void drawNew(NewGraphicsFramework graphics) {
        for (Shape shape : shapes)
            shape.drawNew(graphics);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
