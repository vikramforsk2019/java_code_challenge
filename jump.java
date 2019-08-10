import java.util.*;
class jump
{
	public static void main(String ar[])
	{
		
		int n=0,i=0,j=0;
		int jump=2;
		int count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int s[]=new int[n];
		for(i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
	
		}
		i=0;
		while(i<n)
		{
 if(s[i]!=1)
       {
         s[j]=i;
         //System.out.println(j);
         j++;

         i++;
		}
		else
		{
			i++;
		}
	}
		//System.out.println(j+"  "+i);
	System.out.println("matrix");
	System.out.print(s[0]+"->");
		for(i=1;i<j-1;i++)
		{
			jump++;
			if((s[i]+1==s[i+1])&&(s[i+1]+1==s[i+2]))
			{
				System.out.print(s[i]+"->");
				i++;
			count++;
			}
			else
			{
			
	System.out.print(s[i]+"->");
           }
		}
		System.out.print(s[j-1]+"->");
	System.out.println("JUMP  "+(jump-count));
	
 }
		
	
}