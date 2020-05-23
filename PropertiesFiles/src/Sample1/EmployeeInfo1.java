package Sample1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class EmployeeInfo1 
{
	public static void main(String[] args)
	{
		FileWriter fw=null;
		
		Properties prop=new Properties();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee name:");
		String ename=scan.next();
		System.out.println("Enter employee age:");
		int eage=scan.nextInt();
		String str=String.valueOf(eage);
		
		try
		{
			fw=new FileWriter("E:\\Workspace\\J2EE\\EmployeeDetails\\PersonalDetails1.properties");
			prop.setProperty(ename,str);
			prop.store(fw, "IT IS EXTERNAL FILE");
			System.out.println("Properties File Created Successfully...");
		}
		catch(IOException ie)
	
		{
			ie.printStackTrace();
		}
		finally
		{
			if(fw!=null)
			{
				try
				{
					fw.close();
				}
				catch(IOException ie)
				{
					ie.printStackTrace();
				}
			}
		}
	}
}


