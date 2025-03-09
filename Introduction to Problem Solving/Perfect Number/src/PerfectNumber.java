import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int totalInput;
		
		Scanner input = new Scanner(System.in);
		
		//Read Total number of input
		totalInput = input.nextInt();
		
		//Read all the input in an array
		int inputList[] = new int[totalInput];
		for(int i = 0; i < totalInput; i++)
		{
			inputList[i] = input.nextInt();
		}
		
		//For Each input check is Perfect Number
		for(int num : inputList)
		{
			isPerfectNumber(num);
		}
	}
	
	public static void isPerfectNumber(int num)
	{
		int sum = 0;
		
		for(int i = 1; i <= num/2; i++)		//Time : O(N/2) = O(N)
		{
			if(sum > num)
			{
				break;
			}
			
			if((num % i) == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == num)
		{
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	
}
