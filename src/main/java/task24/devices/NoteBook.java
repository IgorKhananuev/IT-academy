package task24.devices;


public class NoteBook extends DesktopComputer {
    private String noteBookName;
    private int diagonalSize;

    public NoteBook() {
    }

    public NoteBook(int weight, int voltage, int power, int diagonalSize, String noteBookName) {
        super(weight, voltage, power);
        this.diagonalSize = diagonalSize;
        this.noteBookName = noteBookName;
    }
}
