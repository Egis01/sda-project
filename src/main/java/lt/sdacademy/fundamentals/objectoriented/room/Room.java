package lt.sdacademy.fundamentals.objectoriented.room;

public class Room {
    private int width;
    private int length;

    public Room (int width, int length){ // konstruktorius
        this.width=width;
        this.length =length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
