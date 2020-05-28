package week1.arrays;

import java.util.Arrays;

public class PrintAscendingOrder {
	
	public static void main(String args[])
	{
		String[] name = {"Voldemort","Dumbledore","harry","ron","snape","Hagrid"};
		
		Arrays.sort(name);
		
		//---------Using for loop---------//
		
		System.out.println("<<<<Using For Loop>>>>");
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		
		//---------Using for each loop---------//
		
		System.out.println("<<<<Using For Each Loop>>>>");
		for(String each:name)
		{
			System.out.println(each);
		}
		
		
		//---------Using While loop ---------//
		
		
		System.out.println("<<<<Using While Loop>>>>");
		
		int i=0;
		
		while(i!=name.length)
		{
			System.out.println(name[i]);
			i++;
		}
	}

}
