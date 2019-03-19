public class DiagonalPlayer extends Player{
    public DiagonalPlayer(int row, int column) {
        super(row, column);
    }

    public void move(int move) {
        switch(move) {
            case 0: this.row++; this.column++; break;
            case 1: this.row--; this.column--; break;
            case 2: this.row++; this.column--; break;
            case 3: this.row--; this.column++; break;
        }
    }
}
