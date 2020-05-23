package Sample3;

import java.util.Scanner;
import Factory.ProductFactory;
import Sample2.Product;

public class ProductInformation
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		System.out.println("----------------------");
		System.out.println("Mobile");
		System.out.println("Laptop");
		
		
		
		String choice=scan.next();
		
		ProductFactory pf=new ProductFactory();
		
		Product p=pf.getProduct(choice);
		p.productType();
		p.productCost(13000.0);
		
	}
}

