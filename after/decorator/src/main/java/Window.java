public class Window extends Component{
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Window(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public void draw() {
        System.out.println("Drawing window at: " + getX() + " " + getY() + " " + getWidth() + " " + getHeight());
    }
}
