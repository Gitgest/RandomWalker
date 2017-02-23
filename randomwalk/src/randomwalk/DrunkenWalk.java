/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalk;

import java.util.Scanner;

/**
 *
 * @author Rasmus laptop
 */
public class DrunkenWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomWalk drunk;
        int max;   
        int edge;
        int drunks;
        int drunkCounter=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDrunkenWalker Program");
        System.out.println();

        System.out.print("Enter the boundary for the square: ");
        edge = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        max = scan.nextInt();
        System.out.println("Enter the amount of drunks to simulate");
        drunks = scan.nextInt()-1;
        System.out.println("-------------------------------------------------");
        
        //chance of falling off is very high in both cases with boundary 10
        //chance increases with higher step value
        // at the boundary of 50, the chance of falling off is much, much lower.
        for(int i=0; i<=drunks; i++){
            drunk = new RandomWalk(max,edge);
            drunk.walk();
            if(drunk.inBounds() != true){
                drunkCounter = drunkCounter+1;
            }
        }
        
        System.out.println("Drunks have fallen off the platform " +
                    drunkCounter + " times thus far.");
    }

}
