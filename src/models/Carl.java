package models;

import java.util.HashSet;
import java.util.Set;

public class Carl {

    private Set<int[]> visited = new HashSet<>();
    private int[][] room;
    private boolean move;

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


    public void cleanTheSpot(int x, int y) {
        if (getRoom()[x][y] != 1) {
            getRoom()[x][y] = 2;
        }
    }

    public void turnRight(int direction) {
        if (direction != 3) {
            direction += 2;
        } else {
            direction -=2;
        }
    }

}
