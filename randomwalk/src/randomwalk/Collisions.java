/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalk;

/**
 *
 * @author Rasmus laptop
 */
public class Collisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pColliCount=0;
        int pStepCount = 0;
        int max = 100000;
        int edge = 200;
        RandomWalk p1 = new RandomWalk(max, edge, -3, 0);
        RandomWalk p2 = new RandomWalk(max, edge, 0, 3);

        for (int i = 0; i <= max; i++) {
            //use takeStep() instead of walk().
            //walk will take steps on each iteration 'till either moreSteps()
            //or inbounds() returns a false.
            //meaning the particles would never collide.
            p1.takeStep();
            p2.takeStep();
            pStepCount = pStepCount + 1;
            /*System.out.println("Are the particle in the same position?; "+samePosition(p1, p2));
            if (Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2)
                    + Math.pow(p2.getY() - p1.getY(), 2)) == 0) {
                pColliCount = pColliCount++;
            }
            System.out.println("The particles have collided: "
                    + pColliCount + " times");*/
            if (samePosition(p1, p2) == true) {

                pColliCount=pColliCount+1;
            }
            
            System.out.println("At step " + pStepCount + 
                    " the particles have collided: " + pColliCount 
                    + " times thus far");
        }

    }

    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        return (p1.getX() == p2.getX()) && (p1.getY() == p2.getY());
    }
}
