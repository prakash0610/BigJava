/**
 A product with a name and a price.
*/ 

public class Product 
{
	private String name;
    private double price;
    /**
    Constructs a product with a given name and price.
    @param pName the name
    @param pPrice the price
    */ 
    public Product(String pName, double pPrice) 
    {
    	name= pName;
    	price= pPrice;
    }
    
    /**
    Gets the product name.
    @return the name
    */ 
    public String getName() 
    {
		return name;
	}
    
    /**
    Gets the product price.
    @return the price
    */ 
	public double getPrice() 
	{
		return price;
	}
	
	/**
	 Reduces the product price.
	 @param amount the amount by which to reduce the price
	 */ 

	public void reducedPrice(double amount)
	{
		price-=amount;
	}
	
	
    
}
