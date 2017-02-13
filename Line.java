/*****************************************************************
This program demonstrates a simple "Line" class.
Here, a Line class is defined with its properties
and interface (i.e., its methods).
A main method (in TestLine) then creates instances of this
Line class and calls on the methods to demonstrate its behavior.
*****************************************************************/
import java.io.*;
import java.lang.Math;
public class Line
{
  private int thickness=0; //holds the thickness of the line
  private int x1, y1, x2, y2; //coordinates of the line

  //Constructor
  //Receives 4 integers which are the Line's start and end points.
  public Line(int xOne, int yOne, int xTwo, int yTwo)
  {
    // each of these validates its argument - see below.
    setXOne(xOne);
    setYOne(yOne);
    setXTwo(xTwo);
    setYTwo(yTwo);
  } // end constructor

  /*************************************
  method draw() calls another method called drawLine(),
  which is assumed to be a graphics primitive on the
  system. However, since this program will be
  run in console mode, a text description of the Line
  will be displayed. */
  public void draw() {
    drawLine(x1, y1, x2, y2);
  }
  /*************************************
  method drawLine() simulates drawing of a line for console mode.
  It should describe all the important attributes of the line.
  In a graphics mode program, we would delete this and use the
  system's Graphics library drawLine(). */
  private void drawLine(int x1, int y1, int x2, int y2) {
    System.out.println("Draw a line from x of " + x1 + " and y of " + y1);
    System.out.println("to x of " + x2 + " and y of " + y2 + "\n");
  }
  /*************************************
  Method setLine() allows user to change the points of the
  already existing Line. */
  public void setLine(int xOne, int yOne, int xTwo, int yTwo) {
    setXOne(xOne);
    setYOne(yOne);
    setXTwo(xTwo);
    setYTwo(yTwo);
  }
  /**the individual setXXXX methods that prevent
  any line's coordinate from being offscreen.
  In the event of an invalid (offscreen) value,
  that value is (silently) set to 0.
  **************************/
  public void setXOne(int xOne)
  {
    if (xOne < 0 || xOne > 639)
    x1 = 0;
    else
    x1 = xOne;
  }
  /**************************/
  public void setYOne(int yOne)
  {
    if (yOne < 0 || yOne > 479)
      y1 = 0;
    else
      y1 = yOne;
  }
  /**************************/
  public void setXTwo(int xTwo)
  {
    if (xTwo > 639 || xTwo < 0)
      x2 = 0;
    else
      x2 = xTwo;
  }
  /**************************/
  public void setYTwo(int yTwo)
  {
    if (yTwo > 479 || yTwo < 0)
      y2 = 0;
    else
      y2 = yTwo;
  }
  /**************************/
  public void setThickness(int lThick)
    { thickness = lThick; }

  //Now for some "get" Access methods to get individual values

  /**************************/
  public int getXOne()
    { return x1; }
  /**************************/
  public int getYOne()
    { return y1; }
  /**************************/
  public int getXTwo()
    { return x2; }
  /**************************/
  public int getYTwo()
    { return y2; }
  /**************************/
  public int getThickness()
    { return thickness; }
  public void getLength() {
    /*double xx1, xx2, yy1, yy2;
    xx1 = x1;
    xx2 = x2;
    yy1 = y1;
    yy2 = y2;*/
    //double length = Math.sqrt( (xx1-xx2)*(xx1-xx2) + (yy1-yy2)*(yy1-yy2));
    System.out.print("The length of the line is ");
    //System.out.println(length);
    //return length;
  }
} // end class Line
