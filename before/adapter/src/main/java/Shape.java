import frameworkA.GraphicsFrameworkA;
import frameworkB.GraphicsFrameworkB;

public abstract class Shape {
    public abstract void draw(GraphicsFrameworkB graphics);
    public abstract void draw(GraphicsFrameworkA graphics);
}
