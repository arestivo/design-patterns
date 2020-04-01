public class TextView extends Component{
    private int x;
    private int y;
    private String text;

    public TextView(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return text.length() * 10;
    }

    @Override
    public int getHeight() {
        return 10;
    }

    public void draw() {
        System.out.println("Drawing textview at: " + getX() + " " + getY() + " " + getWidth() + " " + getHeight());
    }
}
