package week1.arrays;

import java.util.Arrays;

public class PrintDuplicateNumbers {
	
	public static void main(String args[])
	{
		int[] arr= {11,2,3,45,11,79,86,3,97,21,68,79,2,11};
		int temp=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && temp!=arr[i])
				{
					temp=arr[i];
					System.out.println(arr[i]);
				}
			}
		}
	}

}
