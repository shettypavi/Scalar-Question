import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int totalIP = sc.nextInt();

        for(int i = 1; i <= totalIP; i++)
        {
            int N = sc.nextInt();
            int sum = 1;
            int sqrtN = (int)Math.sqrt(N);

            for(int j = 2; j <= sqrtN; j++)
            {
                if(N % j == 0)
                {
                    if(N % j == j)
                    {
                        sum = sum + j;
                    }else{
                        sum = sum + j + (N / j);
                    }
                }
            }

            if(sum == N)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}