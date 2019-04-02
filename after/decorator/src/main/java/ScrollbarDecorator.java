public class ScrollbarDecorator extends Decorator{
    private int scrollBarPosition;

    public ScrollbarDecorator(Component component) {
        super(component);
        scrollBarPosition = 0;
    }

    @Override
    public void draw() {
        //... Draw a scrollbar
    }
}
