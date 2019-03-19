public class MoveCommand extends Command {
    private Shape shape;
    private int deltaX;
    private int deltaY;

    public MoveCommand(Shape shape, int deltaX, int deltaY) {
        this.shape = shape;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    @Override
    public void execute() {
        shape.move(deltaX, deltaY);
    }

    @Override
    public void undo() {
        shape.move(-deltaX, -deltaY);
    }
}
