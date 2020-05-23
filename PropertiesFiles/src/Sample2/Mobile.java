package Sample2;

public class Mobile implements Product 
{
	@Override
	public void productType()
	{
		System.out.println("***********PRODUCT DETAILS********");
		System.out.println("Product type is:Mobile");
	}
	
	@Override
	public void productCost(double price)
	{
		System.out.println("Mobile price without gst is:"+price);
		double gst1=price+price*0.5;
		System.out.println("Mobile price with 5% gst is:"+gst1);
	}
}

