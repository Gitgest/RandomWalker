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
import java.util.Scanner;

public class TestWalk {

    public static void main(String[] args) {
        int maxSteps;   // maximum number of steps in a walk
        int maxCoord;   // the maximum x and y coordinate
        int x, y;       // starting x and y coordinates for a walk
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        //declaration and instantiation of two walk objects
        //boundary 5, max steps 10
        RandomWalk walk1 = new RandomWalk(10,5);
        
        //boundary  50, max steps 200
        RandomWalk walk2 = new RandomWalk(200, 50);
        
        //instantiate two walk objects, printing to check for error.
        System.out.println(walk1);
        System.out.println(walk2);
        System.out.println("Initial positions\nWalkers begin taking steps below this line\n**************"
                + "********************");
        
        //make each walk object take 5 steps
        for(int i = 1; i <= 5; i++){
            walk1.takeStep();
            walk2.takeStep();
            System.out.println("Walk1; " + walk1);
            System.out.println("walk2; " + walk2);
            System.out.println("------------------");
        }
        
    }
}
