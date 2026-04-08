public class Tablet
{
	private String serialNum;
	private String manufacturer;
	private String OS;
	private double price;
	
	public Tablet(String serial, String manuf, String platform, double p)
	{
		serialNum = serial;
		manufacturer = manuf;
		OS = platform;
		price = p;
	}
	
	public Tablet()
	{
		serialNum = " ";
		manufacturer = " ";
		OS = " ";
		price = 0.0;
	}
	
	public String getSN() {return serialNum; }
	public String getManf() {return manufacturer; }
	public String getOS() {return OS; }
	public double getPrice() {return price; }
	
	public String toString()
	{
		return
		"\nSerial number: " + serialNum + 
		"\nManufacturer: " + manufacturer +
		"\nOS: " + OS +
		"\nPrice: " + price;
	}
}