public class Car
{
	String regNumber;
	String manufacturer;
	double price;
	int yearPurchase;
	
	public Car(String reg, String manuf, double p, int year)
	{
		regNumber = reg;
		manufacturer = manuf;
		price = p;
		yearPurchase = year;
	}
	
	public Car()
	{
		regNumber = " ";
		manufacturer = " ";
		price = 0.0;
		yearPurchase = 0;
	}
	
	public String getRegNumber()	{ return regNumber;	}
	public String getManufacturer()	{ return manufacturer;	}
	public double getPrice()	{ return price;	}
	public int getYearPurchase()	{ return yearPurchase;	}
	
	public String toString()
	{
		return 
		"\nRegistration number: " + regNumber +
		" Manufacturer: " + manufacturer +
		" Price: " + price +
		" Year of purchase: " + yearPurchase ;
	}
	
	public void setPrice (double price)	{	this.price = price;	}
}
