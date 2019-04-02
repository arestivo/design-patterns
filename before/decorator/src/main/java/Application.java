public class Application {
    public static void main(String[] args) {
        Window window = new Window();
        WindowBorder border = new WindowBorder();
        WindowScrollbar scrollbar = new WindowScrollbar();

        window.draw();
        border.draw(window);
        scrollbar.draw(window);
    }
}
