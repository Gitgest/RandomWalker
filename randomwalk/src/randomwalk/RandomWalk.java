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

    //constructors
    public RandomWalk(int max, int edge) {
        this.max = max;
        this.edge = edge;
    }

    public RandomWalk(int max, int edge, int startX, int startY) {
        this.max = max;
        this.edge = edge;
        this.startX = startX;
        this.startY = startY;

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
                    this.stepCount = stepCount+1;
                    break;
                case 1:
                    this.startX = startX - 1;
                    this.stepCount = stepCount+1;
                    break;
                case 2:
                    this.startY = startY + 1;
                    this.stepCount = stepCount+1;
                    break;
                case 3:
                    this.startY = startY - 1;
                    this.stepCount = stepCount+1;
                    break;
            }
        }
    
    public boolean moreSteps(){
        return stepCount<max;
    }
    
    public boolean inBounds(){
        return startX<edge && startX>-edge && startY<edge && startY>-edge;
    }
    //toString method

    @Override
    public String toString() {
        return "Steps: " + stepCount + "; Position: (" + startX + ", " + startY
                + ")";
    }
}


