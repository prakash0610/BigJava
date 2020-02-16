import java.util.Scanner;
public class RockPaperScissorsGameTester {

	public static void main(String[] args) 
	{
		// In this problem we assume that the player 1 has the capability to end the game
		//Create needed local variables
		boolean isDone=false;
		
		//set up scanner object
		Scanner scan = new Scanner(System.in);
		//Do while loop using a sentinel value and a boolean variable    
   do 
	   {
	   System.out.println("Player 1: Choose 'r' for rock, 's' for scissors, or 'p' for paper  (type x to end):");
	   String player1 = scan.next().toLowerCase();
	   
	   //If statement to determine whether value entered by player 1  is our sentinel value
	   if(player1.equals("x")) {
             isDone=true;
	   }
	    //If not the sentinel value go through this else branch to let players keep playing until
		//they decide to stop
	   else {
		   System.out.println("Player 2: Choose 'r' for rock, 's' for scissors, or 'p' for paper:");
		   String player2 = scan.next().toLowerCase();
	   
	     if(player1.equals(player2)) {
		   System.out.println("It is a tie.");
	        }
	     else if(player1.equals("r"))
         {
     	  if(player2.equals("p"))
     	  {System.out.println("Player2 wins");}
     	  else if(player2.equals("s")) 
     	  {System.out.println("Player1 wins");}
     	  else 
     	  {System.out.println("Please enter a valid input");}
     	
         }
         else if (player1.equals("p"))
          {
     	  if(player2.equals("r"))
     	  {System.out.println("Player1 wins");}
     	  else if(player2.equals("s")) 
     	  {System.out.println("Player2 wins");}
     	  else 
     	  {System.out.println("Please enter a valid input");}
          }
        else if(player1.equals("s"))
         {
     	  if(player2.equals("r"))
     	  {System.out.println("Player2 wins");}
     	  else if(player2.equals("p")) 
     	  {System.out.println("Player1 wins");}
     	  else 
     	  {System.out.println("Please enter a valid input");}
         }	
      else
      {
     	 System.out.println("Please enter a valid input");
      }
	}
	   
	   }while(!isDone); 
   
        scan.close();
   
          
      }
	}


