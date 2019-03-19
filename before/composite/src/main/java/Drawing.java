import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        this.shapes = new ArrayList<>();
    }

    public void open(File file) {
        //...
    }

    public void save(File file) {
        //...
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void draw() {
        for (Shape shape : shapes)
            shape.draw();
    }
}
