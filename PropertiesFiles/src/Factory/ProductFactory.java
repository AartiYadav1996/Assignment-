package Factory;
import Sample2.Laptop;
import Sample2.Mobile;
import Sample2.Product;

public class ProductFactory 
{
	public Product getProduct(String productType)
	{
		Product p1=null;
		
		
		if(productType.equalsIgnoreCase("mobile"))
		{
			p1=new Mobile();
		}
		else if(productType.equalsIgnoreCase("laptop"))
		{
			p1=new Laptop();
		}
		
		return p1;
	}
}
