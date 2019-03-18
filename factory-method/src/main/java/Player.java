public abstract class Player {
    protected int row;
    protected int column;

    private int points;

    public Player(int row, int column) {
        this.row = row;
        this.column = column;
        this.points = 0;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void addPoint() {
        points++;
    }

    public abstract void move(int move);

    @Override
    public String toString() {
        return "(" + row + ", " + column + "): " + points;
    }
}
