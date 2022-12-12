////author:harshal y M\\\\
package Ac4Qn1;


import java.util.Scanner;

public class Qn1ArithemeticExceptionClass {
		
	public static void main(String[] args) throws Exception {
			
				// declare and initialize a,b,c are three variables
				int a,b,c;
				try (Scanner sc = new Scanner(System.in)) {
					//  taking the user input two numbers
					System.out.println("Enter 1st number : ");
					a=sc.nextInt();
					
					System.out.println("Enter 2nd number : ");
					b=sc.nextInt();
				}
				
				if(a==0 && b==0)
				{
					 throw new Exception("invalid numbers!!!!!");
					 ////throwing exception because the 0 number entered
				}
				else
				{
					try
					{
						//performing the divide operation and throw the exception
						c=a/b;
						System.out.println("Result:"+c);
					}
					catch(ArithmeticException e)
					{
						//catch the divide by zero exception thrown by the try block
						System.out.println("Arithmetic Exception occured");
						e.printStackTrace();
					}	
				}
		}
	}
