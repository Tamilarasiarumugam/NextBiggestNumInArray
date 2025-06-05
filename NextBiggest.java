package Basics;

public class NextBiggest {
	
	public static void big(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int big=Integer.MAX_VALUE;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					if(arr[j]<big)
					{
						big=arr[j];
					}
					  
					
				}
			}
			if(big!=Integer.MAX_VALUE)
			{
				System.out.print(arr[i]+"->"+big+",");
			}
			else
			{
				System.out.print(arr[i]+"->"+",");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {8,4,1,9,6,2};
		big(arr);
	}

}
