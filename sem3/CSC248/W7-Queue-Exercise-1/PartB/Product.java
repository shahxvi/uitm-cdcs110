public class Product
{
	private String type;
	private String color;
	private char size;
	private double price;
	
	public Product(String t, String c, char s, double p)
	{
		type = t;
		color = c;
		size = s;
		price = p;
	}
	
	public String getType()
	{	return type;	}
	
	public String getColor()
	{	return color;	}
	
	public char getSize()
	{	return size;	}
	
	public double getPrice()
	{	return price;	}
	
	public String toString()
	{
		return
		"\nType - " + type +
		"\nColor - " + color +
		"\nSize - " + size +
		"\nPrice - " + price ;
	}
	
	public void display()
	{	System.out.println("\nType - " + type);
		System.out.println("Price - " + price);
	}

}