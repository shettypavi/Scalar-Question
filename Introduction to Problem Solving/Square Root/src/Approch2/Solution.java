package Approch2;

//Time Complexcity = O(logN) ie. implementing using Binary search 

//NOTE: This solution fails for  N =  1065024 when you take datatype as int
//Expected ans = 1032 but your output = -1
//Reason: your ans was going beyond range of int datatype in java

import java.util.Scanner;

public class Solution 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		long num = input.nextInt();
		
		System.out.print(solve(num));
		
	}
	
	public static long solve(long num)
	{
		long ans = num;
		long lowerLimit = 1;
		long uppertLimit = num;
		
		while(lowerLimit <= uppertLimit)
		{
			ans = (lowerLimit + uppertLimit) / 2;
		
			if(ans * ans > num)
			{
				uppertLimit = ans - 1;
			}else if(ans * ans < num)
			{
				lowerLimit = ans + 1;
			}else if(ans * ans == num)
			{
				return ans;
			}
		}
	
		return -1;
	}

}
