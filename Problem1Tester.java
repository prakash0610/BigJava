import java.util.Scanner;

public class Problem1Tester 
{

	public static void main(String[] args) 
	{
		      
		     // since the problem only says number. here we assume that user will input integer 
		     // and for initializing the highest and lowest number we will use the maximum limit for an integer because we are
		     // expecting users to enter negative values and initializing with zero will may cause incorrect results
		
		     //Create needed local variables
				int sum = 0;
				int count = 0;
				int highestNum= -2147483648;
				int lowestNum =  2147483647;
				String input;
				
			    //set up scanner object
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter a number.  Please use 'x' to stop.  Enter numbers now: ");
				input = in.next();
				//using while loop to allow users keep entering input until they enter x
				while (!input.equals("x")) 
				{
					// calculating sum of the values entered, number of entries, highest, and lowest number
			        sum += Integer.parseInt(input);
			        count++;
			        if (Integer.parseInt(input)> highestNum) {
						highestNum = Integer.parseInt(input);
					}
					if (Integer.parseInt(input) < lowestNum) {
						lowestNum = Integer.parseInt(input);
					}
					
					
			        System.out.print("Please enter a number.  Please use 'x' to stop.  Enter numbers now: ");
			        input = in.next();
			    }
				// printing out the results
				System.out.println("The total count of numbers you entered is "+count+".");
				System.out.println("The sum of the number entered is "+ sum+".");
				System.out.println("The highest number entered was " + highestNum + 
						" and the lowest number entered was " + lowestNum+".");
				in.close();
	}
				
}	
	



    



			
		




