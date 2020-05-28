package week1.arrays;

public class PrintMissingNumbers {
	
	public static void main(String args[])
	{
		int[] num = {5,1,3,4,6,2,8};
		
		A: for(int i=0;i<num.length;i++)
		{
			int no=i+1;
			for(int j=0;j<num.length;j++)
			{
				if(no==num[j])
				{
					no++;
					continue A;
				}
			}
			System.out.println(no);
		}
	}
}

