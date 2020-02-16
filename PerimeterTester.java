import java.awt.Rectangle;

public class PerimeterTester {

	public static void main(String[] args) 
	{
	/**
	 Constructs the rectangular object
	 @param (5,10) is (x,y) coordinates for the rectangle
	 @param 15 is the width
	 @param is the height
	 */
	Rectangle box= new Rectangle(5,10,15,55);
	// calculates the perimeter of the rectangle and uses getWidht and geHeight method
	double perimeter= 2*(box.getWidth()+box.getHeight());
	
	// Prints the expected and actual results
	System.out.println("Expected result: 140");
	System.out.println("Actual result: "+perimeter);
	
	
	}

}
