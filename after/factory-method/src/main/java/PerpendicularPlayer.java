public class PerpendicularPlayer extends Player {
    public PerpendicularPlayer(int row, int column) {
        super(row, column);
    }

    public void move(int move) {
        switch(move) {
            case 0: this.row++; break;
            case 1: this.row--; break;
            case 2: this.column++; break;
            case 3: this.column--; break;
        }
    }
}
