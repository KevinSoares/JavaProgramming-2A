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
    
    // Triangle needs 3 sides
    public int sideA;
    public int sideB;
    public int sideC;
    
    // Constructor takes in 3 values
    public Triangle(int a, int b, int c)
    {
    }
    
    public void SetA(int newVal)
    {
        sideA = newVal;
    }
    
    public void SetB(int newVal)
    {
        sideB = newVal;
    }
    
    public void SetC(int newVal)
    {
        sideC = newVal;
    }
    
    public boolean isTrinagle()
    {
        if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isRight()
    {
        return true;
    }
}
