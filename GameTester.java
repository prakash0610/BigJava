import java.util.Scanner;
public class GameTester {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Player 1: Choose rock, scissors, or paper  (type stop to end):");
			String player1 = scan.next().toLowerCase();
			System.out.println("Player 2: Choose rock, scissors, or paper (type stop to end):");
		    String player2 = scan.next().toLowerCase(); 
	        
	   while(!player1.equals("stop") && !player2.equals("stop"))
		   {
		   
			    
		     if (player1.equals("rock"))
	          {
	        	if(player2.equals("paper"))
	        	{System.out.println("Player2 wins");}
	        	else if(player2.equals("scissors")) 
	        	{System.out.println("Player2 wins");}
	        	else if(player2.equals("rock")) 
	        	{System.out.println("It is a tie");}
	        	else 
	        	{System.out.println("Please enter a valid input");}
	        	
	          }
	         else if (player1.equals("paper"))
	           {
	        	if(player2.equals("rock"))
	        	{System.out.println("Player1 wins");}
	        	else if(player2.equals("scissors")) 
	        	{System.out.println("Player2 wins");}
	        	else if(player2.equals("paper")) 
	        	{System.out.println("It is a tie ");}
	        	else 
	        	{System.out.println("Please enter a valid input");}
	           }
	         else if(player1.equals("scissors"))
	          {
	        	if(player2.equals("rock"))
	        	{System.out.println("Player2 wins");}
	        	else if(player2.equals("paper")) 
	        	{System.out.println("Player1 wins");}
	        	else if(player2.equals("scissors")) 
	        	{System.out.println("It is a tie");}
	        	else 
	        	{System.out.println("Please enter a valid input");}
	        	
	          }	
	         else
	         {
	        	 System.out.println("Please enter a valid input");
	         }
		     
		     
		        System.out.println();
			    System.out.println("Player 1: Choose rock, scissors, or paper  (type stop to end):");
				player1 = scan.next().toLowerCase();
				System.out.println("Player 2: Choose rock, scissors, or paper (type stop to end):");
			    player2 = scan.next().toLowerCase();
		   }  
		    

	       scan.close();
	   
	          
	      }
	            
	}


