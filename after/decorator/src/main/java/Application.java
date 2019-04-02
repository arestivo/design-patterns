public class Application {
    public static void main(String[] args) {
        Component window = new BorderDecorator(new ScrollbarDecorator(new Window()), 10);

        window.draw();
    }
}
