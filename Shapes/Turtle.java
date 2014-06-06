/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;

import java.awt.Color;

/**
 *
 * @author user
 */
public class Turtle {

    private double x,y;
    private double angle;
            
    
    public Turtle(double x0, double y0, double a0)
    {
        x = x0;
        y = y0;
        angle = a0;
        
    }
    
    public void turnLeft(double delta)
    {
        angle += delta;
    }
    
    public void goForward(double step)
    {
        double oldx = x;
        double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.setPenRadius(.001);
        StdDraw.line(oldx, oldy, x, y);
        StdDraw.show(20);

                        
    }
    //Create the drawSquare method using length as the only argument
    public void drawSquare (Double length)
    {
        //Draw the first side
        goForward(length);
        //Turn 90 degrees
        turnLeft(90);
        //Draw the second side
        goForward(length);
        //Turn 90 degrees
        turnLeft(90);
        //Draw the third side
        goForward(length);
        //Turn 90 degrees
        turnLeft(90);
        //Draw the last side
        goForward(length);
    }
    //Make et a drawShaype methodd 
    public void drawShape(Double step, int sides)
    {
        //Adjust terning angle according to the number of sides
        double angle = 360/sides;
        //Start a loop to draw shape
        for(int numberOfSides=0; numberOfSides < sides; numberOfSides ++)
        {
            //Go forward
            goForward(step);
            //Make like nascar and take a left
            turnLeft(angle);
        }
    }
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double angle = 360.0/N;
        double step = Math.sin(Math.toRadians(angle/2));
        Turtle turtle = new Turtle(0.5, .0, angle/2);
        for(int i = 0; i < N; i++)
        {
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }
    }
}
