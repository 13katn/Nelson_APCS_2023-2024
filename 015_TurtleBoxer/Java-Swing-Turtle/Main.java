import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    
    //Instantiate a turtle. Name it as you wish.

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___| 

    */

  

        World size = new World(220,220);
        Turtle turtleBob = new Turtle(size);

        // first top right square 
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();

        turtleBob.forward();
        turtleBob.turnLeft();
        turtleBob.forward();
        turtleBob.turnLeft();
        turtleBob.forward();
        turtleBob.turnLeft();
        turtleBob.forward();

        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
// top left
        turtleBob.turnLeft();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();
        turtleBob.turnRight();
        turtleBob.forward();





        // second square top left

        // third square bottom right

        //third square bottom left

        size.show(true);
    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
  }
}
