//author:harshal y M
package Ac4Qn3;

import java.util.Scanner;

public class Qn3NameEX extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Qn3NameEX(String string) {
		// TODO Auto-generated constructor stub
	}
	void validateName(String name) throws Qn3NameEX { 
		String[] names = { "tom", "jerry", "danny", "tiger","harry"};
        boolean found= false;
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("the name is present");
        } 
        else 
        {
            throw new Qn3NameEX("the name is not present");
        }
    }
	public static void main(String[] args) 
	{
		Qn3NameEX i=new Qn3NameEX(null);
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Name:");
			String name = sc.next();
			try
			{
			    i.validateName(name);
			}
			catch(Qn3NameEX e) 
			{
			    System.out.println("Invalid Name " +e);
			}
		}
 }

}
