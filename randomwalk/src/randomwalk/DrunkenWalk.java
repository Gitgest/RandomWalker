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
        int drunkCounter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDrunkenWalker Program");
        System.out.println();

        System.out.print("Enter the boundary for the square: ");
        edge = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        max = scan.nextInt();
        System.out.println("Enter the amount of drunks to simulate");
        drunks = scan.nextInt();
        
        for(int i=0; i<=drunks; i++){
            drunk = new RandomWalk(edge,max);
            if(drunk.inBounds()==false){
                drunkCounter = drunkCounter+1;
            }
            drunk.walk();
            System.out.println("Drunks have fallen off the platform "+
                    drunkCounter + " thus far.");
        }
    }

}
