 


import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    int beepers;
    
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        for (int x = 1; x>0; x++) {
            if (!nextToABeeper()) {
                move();
            }
            analyzeClue();
        }
    }
    public void analyzeClue() {
        beepers = 0;
        while (nextToABeeper()) { 
            pickBeeper();
            beepers++;
        }
        if (beepers == 1) {
            moveNorth();
        }
        else if (beepers == 2) {
            moveEast();
        }
        else if (beepers == 3) {
            moveSouth();
        }
        else if (beepers == 4) {
            moveWest();
        }
        else if (beepers == 5) {
            turnOff();
        }
    }
    public void moveNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
        move();
    }
    public void moveSouth() {
        while (!facingSouth()) {
            turnLeft();
        }
        move();
    }
    public void moveWest() {
        while (!facingWest()) {
            turnLeft();
        }
        move();
    }
    public void moveEast() {
        while (!facingEast()) {
            turnLeft();
        }
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
