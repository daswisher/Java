/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment11;

/**
 *
 * @author Das
 */
//Create the Universe class
public class Universe {
    //Declare variables
    private double h,w;
    private int numberOfTurtles;
    private Turtle[] turtle;
    //Make dat constructor
    public Universe(double width, double height, int N)
    {
        h = height;
        w = width;
        numberOfTurtles = N;
        //Create set of turtles
        turtle = new Turtle[N];
        for(int i=0; i < N; i++)
        {
            //Place the tertles randumly wit random vectors
            double x0 = Math.random()* width;
            double y0 = Math.random()*height;
            double angle = Math.random()*360;
            //Make sum babies!!!
            turtle[i] =new Turtle(x0, y0, 0);
        }
        
    }
    //Make moove turtle
    public void moveTurtles(double stepLength, int numberOfSteps)
    {
        //Set the loop tomove all of the turtles
        for(int z = 0; z < numberOfSteps; z++)
        {
            //Do it fer each tertle
            for(int i = 0; i < numberOfTurtles; i++)
            {
               //Blah blah blah
               double angle = Math.random()*360;
               turtle[i].turnLeft(angle);
               turtle[i].goForward(stepLength);
            }
        }
    }
}
