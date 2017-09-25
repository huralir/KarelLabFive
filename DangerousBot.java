package KarelLabFive;

 


 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    int pile;
    int remainder;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        pickUpFirstPile();
        moveToRoom();
        pickPileInRoom();
        returnToMiddle();
    }
    public void pickUpFirstPile() {
        while (nextToABeeper()) {
            pickBeeper();
            pile++;
        }
    }
    public void moveToRoom() {
        remainder = pile%2;
        if (remainder == 0) {
            turnRight();
            move();
        }
        else {
            turnLeft();
            move();
        }
    }
    public void pickPileInRoom() {
        while (nextToABeeper()) {
            pickBeeper();
        }
    }
    public void returnToMiddle() {
        turnLeft();
        turnLeft();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
