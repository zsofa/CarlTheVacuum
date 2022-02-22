package models;

import java.util.HashSet;
import java.util.Set;

public class Carl {

    private Set<int[]> visited = new HashSet<>();
    private int[][] room;
    private boolean move;
    private int direction;

    public Carl(int[][] room) {
        this.room = room;
    }

    public Set<int[]> getVisited() {
        return visited;
    }

    public void setVisited(Set<int[]> visited) {
        this.visited = visited;
    }

    public int[][] getRoom() {
        return room;
    }

    public void setRoom(int[][] room) {
        this.room = room;
    }

    public boolean isMove( int x, int y, int[][] room) {
        return false;
    }

    public void setMove(boolean move) {
        this.move = move;
    }



    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void cleanTheSpot(int row, int column) {
        if (getRoom()[row][column] != 0) {
            getRoom()[row][column] = 2;
        }
    }

}
