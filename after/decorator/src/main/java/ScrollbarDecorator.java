public class ScrollbarDecorator extends Decorator{
    private final int scrollBarWidth;
    private int scrollBarPosition;

    public ScrollbarDecorator(Component component, int scrollBarWidth) {
        super(component);
        this.scrollBarPosition = 0;
        this.scrollBarWidth = scrollBarWidth;
    }

    @Override
    public void draw() {
        decoratedComponent.draw();

        //... And then draws a scrollbar around the decorated component
        System.out.println("Drawing scrollbar at: " + getX() + " " + getY() + " " + getWidth() + " " + getHeight());
    }

    @Override
    public int getWidth() {
        return super.getWidth() + scrollBarWidth;
    }

    @Override
    public int getHeight() {
        return decoratedComponent.getHeight() + scrollBarWidth;
    }
}
