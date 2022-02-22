package services;

import models.Room;

public class DataLoader {

    public DataLoader() {
        exampleRoom();
    }

    public Room exampleRoom() {
        int [][] room = {
                {0,1,0,0},
                {0,0,1,0},
                {0,1,0,0},
                {0,0,0,0}
        };
        return new Room(4, 4, room);

    }
}
