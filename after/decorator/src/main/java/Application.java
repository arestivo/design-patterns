public class Application {
    public static void main(String[] args) {
        Component window = new BorderDecorator(
                    new ScrollbarDecorator(
                            new Window(10, 10, 100, 100)
                    , 10)
                , 5);

        Component textview = new BorderDecorator(
                    new TextView(50, 50, "Hello World")
                ,2);

        window.draw();
        textview.draw();
    }
}
