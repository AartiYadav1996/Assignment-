package Sample2;

public class Laptop implements Product 
{
	@Override
	public void productType()
	{
		System.out.println("***********PRODUCT DETAILS********");
		System.out.println("Product type is: Laptop");
	}
	
	@Override
	public void productCost(double price)
	{
		System.out.println("Laptop price without gst is:"+price);
		double gst1=price+(price*0.10);
		System.out.println("Laptop price with 10% gst is:"+gst1);
	}
}
