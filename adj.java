
//remove adjacent dublicate characters from the string  question by al company
import java.util.*;
class adj
{

	static void fun(String s1)
	{
		int i=0;
		//System.out.println(s1);

		 if(s1.charAt(0)!=s1.charAt(1))
    System.out.print(s1.charAt(0));

		for(i=1;i<s1.length()-1;i++)
		{	
               if(s1.charAt(i)!=s1.charAt(i-1)&&s1.charAt(i)!=s1.charAt(i+1))

				System.out.print(s1.charAt(i));

		}
		if(s1.charAt(s1.length()-2)!=s1.charAt(s1.length()-1))
		System.out.println(s1.charAt(s1.length()-1));
	}
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		String s1="";
		s1=scan.next();
		fun(s1);
	}
}
