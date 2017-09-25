package KarelLabFive;

 

 
import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    int doubleBeepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    } 

    public void thing() {
        move();
    }
    public void doubleBeepers()
    {
        move();
        pickUpPile();
        putDownPile();
        move();
        putDownDoublePile();
        move();
    }
    public void pickUpPile() {
        //beepers = int 0;
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        doubleBeepers = 2 * beepers;
    }
    public void putDownPile() {
        while (beepers > 0) {
           putBeeper();
           beepers--;
        }
    }
    public void putDownDoublePile() {
        while (doubleBeepers > 0) {
           putBeeper();
           doubleBeepers--;
        }
    }
}
