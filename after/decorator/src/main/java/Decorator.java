public abstract class Decorator extends Component{
    protected Component decoratedComponent;

    public Decorator(Component component) {
        this.decoratedComponent = component;
    }

    @Override
    public int getX() {
        return decoratedComponent.getX();
    }

    @Override
    public int getY() {
        return decoratedComponent.getY();
    }

    @Override
    public int getWidth() {
        return decoratedComponent.getWidth();
    }

    @Override
    public int getHeight() {
        return decoratedComponent.getHeight();
    }
}
