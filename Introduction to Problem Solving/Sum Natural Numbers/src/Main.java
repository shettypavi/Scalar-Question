import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		int num;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		sum = (num * (num + 1)) / 2;
		
		System.out.print(sum);
	}

}
