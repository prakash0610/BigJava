/**
 This program prints the Product class.
*/
public class ProductPrinter {
	/**
       Tests the methods of the Product class.
       @param args not used 
	 */

	public static void main(String[] args) 
	{
		/**
		    constructs a new product i.e. firstProduct 
		    @param Iron the product name
		    @param 29.5 the product price
		 */
		Product firstProduct= new Product("Iron", 29.5);
		// Prints the expected output
		System.out.println("Expected out put is Iron, price is 29.5 , and the reduced price is 24.5 .");
		// prints the actual out put
		System.out.println("The product is "+ firstProduct.getName() +", price is "+firstProduct.getPrice());
		// Uses the reducedPrice method to deduct price by 5
		firstProduct.reducedPrice(5);
		// Prints the reduced price
		System.out.println("The reduced price is "+firstProduct.getPrice());
	

		System.out.println();
		System.out.println();
		
		/**
	    constructs a new product i.e. secondProduct 
	    @param Vacuum the product name
	    @param 35.90 the product price
	 */
		Product secondProduct= new Product("Vacuum", 35.90);
		// Prints the expected output
		System.out.println("Expected out put is Vacuum, price is 35.90 , and the reduced price is 30.90 .");
		// prints the actual out put
		System.out.println("The product is "+ secondProduct.getName() +", price is "+secondProduct.getPrice());
		// Uses the reducedPrice method to deduct price by 5
		secondProduct.reducedPrice(5);
		// Prints the reduced price
		System.out.println("The reduced price is "+secondProduct.getPrice());
	
	}

	

}
