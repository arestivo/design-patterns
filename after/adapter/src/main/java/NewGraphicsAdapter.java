public class NewGraphicsAdapter extends OldGraphicsFramework{
    private final NewGraphicsFramework adaptedFramework;

    public NewGraphicsAdapter(NewGraphicsFramework framework) {
        this.adaptedFramework = framework;
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        adaptedFramework.doARectangle(x, y, x + width, y + height);
    }

    @Override
    public void drawCircle(double x, double y, double radius) {
        adaptedFramework.doACircle(x, y, radius);
    }
}
