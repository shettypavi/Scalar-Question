import java.util.Scanner;

public class Solution 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		System.out.print(solve(num));
		
	}
	
	public static int solve(int num)
	{
		int i = 1;
		while((i * i) <= num)
		{
			if((i * i) == num)
			{
				return i;
			}
			
			i++;
		}
		
		return -1;
	}

}
