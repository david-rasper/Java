/***************************************************************
Now we will define a driver program below called
TestLine with main() where execution will begin.
It is this class, and this code, that will create instances
of the Line and call its methods. As a test module,
this code would be improved with additional System.out.println()
statements that explain what is being attempted and what
the results should be, for example:
"About to change l1 to an invalid value and then redraw it.
Line position should not change: "
*/
//*********************************************************/
class TestLine {
  public static void main(String args[]) {
    Line l1 = null, l2 = null; //declare 2 instances of Line class
	/**create 1 Line object*/
    l1 = new Line (10, 10, 100, 100);
	/**draw it*/
    11.getLength();
    //System.out.println(m);
    l1.draw();
    /**change start point with valid values */
    l1.setLine(5, 5, l1.getXTwo(), l1.getYTwo());
    /**draw it again with new start point */
    l1.draw();
	/**try to change xOne (x1) to an illegal value */
    l1.setXOne(3000);
	/**draw the line...x1 should now be zero */
    l1.draw();
        /**create a second Line instance, or object */
    l2 = new Line(100, 100, 400, 400);
	/**draw 2nd line */
    l2.draw();
	/**set a new valid yTwo for line 2 */
    l2.setYTwo(479);
	/**draw 2nd line again */
    l2.draw();
  } // end of main
}  // end class TestLine
