package services;

import models.Carl;
import models.Room;

public class Cleaning {

    private Carl carl;
    private Room room;

    public Cleaning() {
    }

    public void cleanAll(Carl carl, Room room) {
        carl.setMove(true);
        findTheWay(0,0,0,carl, room);
    }


    public void findTheWay(int currX, int currY, int currDirection, Carl carl, Room room){
        carl.getVisited().add(new int[]{currX,currY});
        carl.cleanTheSpot(currX,currY);

        int newX = currX;
        int newY = currY;

        for (int i = 0; i < 4; i++) {
            int newDirection =(currDirection + i) % 4;
                switch (newDirection) {
                    case 0:
                    newX -= 1;
                    break;
                    case 1:
                        newY += 1;
                        break;
                    case 2:
                        newX += 1;
                        break;
                    case 3:
                        newY -= 1;
                        break;
                }

                if (!carl.getVisited().contains(new int[]{newX,newY})
                        && carl.isMove(newX, newY, room.getGrid())) {
                    findTheWay(newX, newY,newDirection, carl, room);
                    turnBack(newDirection,newX,newY,room.getGrid());
            }
            carl.turnRight(newDirection);
                // try: one turn is 90 degree, change it to 180

        }

    }

    private void turnBack(int direction, int x, int y, int[][] room) {
        carl.turnRight(direction);
        carl.isMove(x,y, room);
        carl.turnRight(direction);

    }
}
