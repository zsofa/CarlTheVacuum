package models;

public class Room {

    private int x;
    private int y;
    private int[][] grid;

    public Room(int x, int y, int[][] roomCoordinateSystem) {
        this.x = x;
        this.y = y;
        this.grid = roomCoordinateSystem;
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

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }
}
