 


import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    int x;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void fixBallots() {
        for (x = 0; x < 5; x++) {
            move();
            if (nextToABeeper()) {
                fillRoom();
            }
            else {
                emptyRoom();
            }
            move();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    public void fillRoom() {
        turnLeft();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
        putBeeper();
        turnAround();
        move();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
        putBeeper();
        turnAround();
        move();
        turnRight();
    }
    public void emptyRoom() {
        turnLeft();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
        turnAround();
        move();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
        turnAround();
        move();
        turnRight();
    }
}

