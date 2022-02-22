package models;

public class Room {

    private int x;
    private int y;
    private int[][] roomCoordinateSystem;
   // private final int[] DIRECTIONS = {0,1,2,3};


    public Room(int x, int y, int[][] roomCoordinateSystem) {
        this.x = x;
        this.y = y;
        this.roomCoordinateSystem = roomCoordinateSystem;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[][] getRoomCoordinateSystem() {
        return roomCoordinateSystem;
    }

    public void setRoomCoordinateSystem(int[][] roomCoordinateSystem) {
        this.roomCoordinateSystem = roomCoordinateSystem;
    }
}
