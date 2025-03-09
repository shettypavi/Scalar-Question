import java.util.Scanner;

public class PerfectNumberV2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] inputList = new int[N];
		
		for(int i = 0; i < N; i++)
		{
			inputList[i] = input.nextInt();
		}
		
		for(int num : inputList)
		{
			isPerfectNumber(num);
		}
	}

	public static void isPerfectNumber(int num) 
	{
		int sum = 1;
		for(int i = 2; i < Math.sqrt(num); i++)	//Time : O(sqrt(N))
		{
			if( num % i == 0)
			{
				sum = sum + i + (num / i);
				
				if(sum > num)
				{
					break;
				}
			}
		}
		
		if(sum == num)
		{
			System.out.println("YES");
		}else
		{
			System.out.println("NO");
		}
	}

}