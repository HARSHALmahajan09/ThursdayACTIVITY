//Author Harshal 

package Activity3Qn2;

public class LowLetUnderscore 
{
	public static void main(String[] args)
	
	{
System.out.println(validate("Harshal mahajan"));
System.out.println(validate("Harshal mahajan"));
System.out.println(validate("Harshal mahajan"));		
System.out.println(validate("Harshal mahajan"));	

}	
public static String validate(String text)

{
if (text.matches("^[a-z]+_[a-z]+$"))
        return "Found a match!";
else
        return "Not matched!";
}
}