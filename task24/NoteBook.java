package task24;

class NoteBook extends DesktopComputer {
    String noteBookName;
    int diagonalSize;

    NoteBook() {
    }

    NoteBook(int weight, int voltage, int power, int diagonalSize, String noteBookName ) {
        super(weight,voltage,power);
        this.diagonalSize = diagonalSize;
        this.noteBookName = noteBookName;
    }
}
