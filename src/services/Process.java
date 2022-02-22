package services;

import models.Carl;
import models.Room;

public class Process {

    public void run() {
        try {
            DataLoader dataLoader = new DataLoader();
            Room room = dataLoader.exampleRoom();
            Carl carl = new Carl(room.getRoomCoordinateSystem());
            Cleaning cleaning = new Cleaning();
            cleaning.cleanAll(carl,room);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
