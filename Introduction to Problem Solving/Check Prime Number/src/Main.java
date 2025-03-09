/*
 * 								Problem Description
Given an integer A, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.

Problem Constraints
1 <= A <= 106

Input Format
First and only line of the input contains a single integer A.

Output Format
Print YES if A is a prime, else print NO.

Example Input
Input 1: 3 
Input 2: 4 

Example Output
Output 1: YES 
Output 2: NO 

Example Explanation
Explanation 1:
3 is a prime number as it is only divisible by 1 and 3.
Explanation 2:
4 is not a prime number as it is divisible by 2.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;//input
        int count = 0; //keep track of divisor

        Scanner input = new Scanner(System.in);

        num = input.nextInt(); //read input 

        for(int i = 1; i <= Math.sqrt(num); i++)
        {
            if((num % i) == 0)
            {
                if(i == (num/i))
                {
                    count++;
                }else{
                    count += 2;
                }
            }

            if(count > 2)
            {
                break;
            }
        }
        
        if(count == 2)
        {
            System.out.println("YES");
        }else{
        	System.out.println("NO");
        }

    }
}