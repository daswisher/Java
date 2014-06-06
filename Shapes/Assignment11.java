
package assignment11;

/**
 *
 * @author Michael V. Swisher
 */
public class Assignment11 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // This stuff just creates the blank canvas that you will be drawing on. You can adjust the size if you would like.
        StdDraw.setCanvasSize(1000, 1000);
        StdDraw.setXscale(0, 1000);
        StdDraw.setYscale(0, 1000);
        
        /*
        //This is the original code uploaded on moodle
        Turtle t = new Turtle(200, 200, 0);
        t.goForward(200);
        t.turnLeft(90);
        t.goForward(200);
        StdDraw.clear();
        */
        //Create initial vector components of the turtle
        //Initial x coordinate
        int x0 = 500;
        //Initial y coordinate
        int y0 = 500;
        //Initial heading (This is the initial angle the turtle starts at)
        int a0 = 000;
        //Create a new instance of Turtle with the vector components
        Turtle turtle0 = new Turtle(x0, y0, a0);
        //Prep the drawsquare for the turtle
        //Define the side length of the square
        Double length = Double.parseDouble(args[0]);
        //Have the turtle draw the square using the defined side length
        turtle0.drawSquare(length);
        StdDraw.clear();
        //Reset the turtle by simply creating a new instance
        Turtle turtle1 = new Turtle(x0, y0, a0);
        //Have the new turtle draw a shape with a given side length and number of sides
        //Note: side length is double instead of integer because precision is sexy!!!
        turtle1.drawShape(100.0, 6);
        StdDraw.clear();
        //This is the part where things get crazy and we start making dem spirals
        //Reset dat turtle
        Turtle turtle2 = new Turtle(x0,y0,a0);
        //Set da number of iterations
        int iterations=2;
        //Define initial side length
        double sideLength = 1.0;
        int sides = 3;
        //Create a loop that draws a shape equal to the number of iterations
        for(int i=0; i < iterations; i++){
            //Have turtle draw shaypes
            turtle2.drawShape(sideLength, sides);
            //Set zee side length
            sideLength+=1.0;
            //Made de tertle turn after finishing the shape
            turtle2.turnLeft(3);
            //Increase the number of sides
            sides += 1;
        }
        //Clear the canvas
        StdDraw.clear();
        //UNIVERSE OF SPAGHETTI!!! (Make instance of universe)
        Universe spaghetti = new Universe(1000, 1000, 20);
        //Release the spaghetti monsters!
        spaghetti.moveTurtles(10, 20);
    }
}
