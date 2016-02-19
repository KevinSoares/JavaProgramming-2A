/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Kevin Soares
 */
public class Triangle {

    /**
     * Side A of the triangle
     */
    private int sideA;
    /**
     * Side B of the triangle
     */
    private int sideB;
    /**
     * Side C of the triangle
     */
    private int sideC;

    /**
     *
     * @param a input of side a of the triangle
     * @param b input of side b of the triangle
     * @param c input of side c of the triangle
     */
    public Triangle(int a, int b, int c) {
        if (a > b && a > c) {
            sideC = a;
            sideA = c;
            sideB = b;
        } else if (b > a && b > c) {
            sideC = b;
            sideA = a;
            sideB = c;
        } else {
            sideA = a;
            sideB = b;
            sideC = c;
        }
    }

    /**
     * Set the value of A and use this for getting in the main method after
     *
     * @return sideA
     */
    public int getA() {
        return sideA;
    }

    /**
     * Set the value of B and use this for getting in the main method after
     *
     * @return sideB
     */
    public int getB() {
        return sideB;
    }

    /**
     * Set the value of C and use this for getting in the main method after
     *
     * @return SideC
     */
    public int getC() {
        return sideC;
    }

    /**
     * Check if the triangle is valid and return the correct boolean
     *
     * @return true or false
     */
    public boolean isTriangle() {
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculate if triangle is right angled and send the appropriate boolean
     * value
     *
     * @return true or false
     */
    public boolean isRight() {
        double aPower = Math.pow((double) sideA, 2.0);
        double bPower = Math.pow((double) sideB, 2.0);
        double cPower = Math.pow((double) sideC, 2.0);

        return aPower + bPower == cPower;
    }
}
