public class BorderDecorator extends Decorator {
    private int borderWidth;

    public BorderDecorator(Component component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    public void draw() {
        decoratedComponent.draw();

        //... And then draw a border around the decorated component
        System.out.println("Drawing border at: " + getX() + " " + getY() + " " + getWidth() + " " + getHeight());
    }

    @Override
    public int getX() {
        return super.getX() - borderWidth;
    }

    @Override
    public int getY() {
        return super.getY() - borderWidth;
    }

    @Override
    public int getWidth() {
        return super.getWidth() + borderWidth * 2;
    }

    @Override
    public int getHeight() {
        return super.getHeight() + borderWidth * 2;
    }
}

