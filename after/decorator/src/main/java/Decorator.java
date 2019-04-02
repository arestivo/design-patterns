public abstract class Decorator extends Component{
    protected Component decoratedComponent;

    public Decorator(Component component) {
        this.decoratedComponent = component;
    }
}
