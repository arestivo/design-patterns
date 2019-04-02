public class BorderDecorator extends Decorator {
    private int width;

    public BorderDecorator(Component component, int width) {
        super(component);
        this.width = width;
    }

    public void draw() {
        //... Draw a border
    }
}
