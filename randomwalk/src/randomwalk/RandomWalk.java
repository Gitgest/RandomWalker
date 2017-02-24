/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalk;

import java.util.Random;

/**
 *
 * @author Rasmus laptop
 */
public class RandomWalk {

    private int startX = 0;
    private int startY = 0;
    private int max;
    private int stepCount;
    private int edge;
    private int maxDistance;

    //constructors
    public RandomWalk(int max, int edge) {
        this.max = max;
        this.edge = edge;
        this.startX = 0;
        this.startY = 0;
        this.maxDistance = 0;
    }

    public RandomWalk(int max, int edge, int startX, int startY) {
        this.max = max;
        this.edge = edge;
        this.startX = startX;
        this.startY = startY;
        this.maxDistance = 0;

    }

    //Should generate a random value, on which the point should take a step
    //in either four directions
    public void takeStep() {
        Random rand = new Random();

        int randomNum = (int) rand.nextInt(4);
        /* check if while loop is good */

        switch (randomNum) {
            case 0:
                this.startX = startX + 1;
                break;
            case 1:
                this.startX = startX - 1;
                break;
            case 2:
                this.startY = startY + 1;;
                break;
            case 3:
                this.startY = startY - 1;
                break;
        }
        this.stepCount = stepCount + 1;
        this.maxDistance=max(maxDistance,max(startX, startY));
    }
    //check if walker as reached neccesary steps
    public boolean moreSteps() {
        return stepCount < max;
    }

    //check if walker has reached the boundary
    public boolean inBounds() {
        return (startX < Math.abs(edge))  && (startY < Math.abs(edge));
    }

    //simulate a random walk 'till moreSteps() and inBounds() both return false
    public void walk() {
        while ((inBounds() == true) && (moreSteps() == true)) {
            takeStep();
            /*if(inBounds()==false){System.out.println("out of bounds");
            if(moreSteps()==false){System.out.println("max number of steps has"
                    + " been reached");}*/
        }
    }

    private int max(int num1, int num2) {
        if (Math.abs(num1) >= Math.abs(num2)) {
            return num1;
        } else {
            return num2;
        }
    }

    public int getX() {
        return startX;
    }

    public int getY() {
        return startY;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
    
    

//toString method
    @Override
    public String toString() {
        return "Steps: " + stepCount + "; Position: (" + startX + ", " + startY
                + ")";
    }
}
