/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Kevin Soares
 */
public class Lab2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Storage for sideA
         */
        int triangleSideA;
        /**
         * Storage for sideB
         */
        int triangleSideB;
        /**
         * Storage for sideC
         */
        int triangleSideC;
        
        // Create Scanner to get user input
        Scanner input = new Scanner(System.in);
        
        // Set our triangle sides locally
        System.out.print("Enter three integer values: ");
        triangleSideA = input.nextInt();
        triangleSideB = input.nextInt();
        triangleSideC = input.nextInt();
        
        // Make a triangle and pass the params
        Triangle myTriangle = new Triangle(triangleSideA, triangleSideB, triangleSideC);
        
        // Check if the triangle is valid
        if(myTriangle.isTriangle())
        {
            System.out.printf("The numbers (%d,%d,%d) can form a triangle" + "\n", myTriangle.getA(),myTriangle.getB(),myTriangle.getC());
        }
        else
        {
            System.out.printf("The numbers (%d,%d,%d) cannot form a triangle" + "\n", myTriangle.getA(),myTriangle.getB(),myTriangle.getC());
        }
        
        // Check if the triangle is a right triangle
        if(myTriangle.isRight())
        {
            System.out.printf("The numbers (%d,%d,%d) can form a right-angle triangle" + "\n", myTriangle.getA(),myTriangle.getB(),myTriangle.getC());
        }
        else
        {
            System.out.printf("The numbers (%d,%d,%d) cannot form a right-angle triangle" + "\n", myTriangle.getA(),myTriangle.getB(),myTriangle.getC());
        }
    }
    
}
