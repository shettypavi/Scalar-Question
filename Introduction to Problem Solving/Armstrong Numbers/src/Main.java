import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int[] cube = new int[10];
		int upperBound = input.nextInt();
		int originalNumber;
		int dublicateNumber;
		int digit;
		int sum;
		
		//calculate cube for each digits
		for(int i = 0; i <= 9; i++)
		{
			cube[i] = (int) Math.pow(i, 3);
		}
		
		for(int i = 1; i <= upperBound; i++)
		{
			originalNumber = i;
			dublicateNumber = originalNumber;
			sum = 0;
			while(dublicateNumber > 0)
			{
				digit = dublicateNumber % 10;
				sum = sum + cube[digit];
				dublicateNumber = dublicateNumber / 10;
				
				if(originalNumber < sum)
				{
					break;
				}
			}
			
			if(sum == originalNumber)
			{
				System.out.println(originalNumber);
			}
		}
	}

}
