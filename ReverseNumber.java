//Author Harshal 

package Activity3Qn1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse: ");
		 try (Scanner sc = new Scanner(System.in)) {
			int number=sc.nextInt();		
					
			int reverse=0;
			
			while(number!=0)
			{
				int remainder=number%10;				
				reverse=reverse*10+remainder;
				number=number/10;
			}
			System.out.println("The reverse of the given no is: "+reverse);
		}		
		
		
	}
}

class Sum extends ReverseNumber			 
{
	public void sumdigit()			
	{
		System.out.println("Enter the number to find sum: ");
		try (Scanner sc = new Scanner(System.in)) {
			int number=sc.nextInt();
			
			int sum=0,digit;
			
			while(number>0)		
			{
				digit=number%10;					
				sum=sum+digit;
				number=number/10;
				
			}
			System.out.println("Sum of digit is: "+sum);
		}
	}

	public void reverse() {
		
	}
}	