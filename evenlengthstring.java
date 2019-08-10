class evenlengthstring
{
	static void fun(String s)
	{
		String s1=null;
		int i=0,j=0,currentl=0,maxl=0,fixl=0;
		maxl=s.length();
		while(i<maxl)
		{
			if(s.charAt(i)==' '||i==maxl-1)
			{
				if(currentl%2==0)
				{
					if(fixl<currentl)
						fixl=currentl;
					System.out.println("even length:"+fixl);
					//  System.out.println(s.substring(j,currentl));
					j=currentl;
			
					currentl=0;
    
				}
			} 
		
			else
			{
				currentl++;
			}
			i++;
		}
		i=fixl;
		while(i>0&&s.charAt(i)!=' ')
		{
		 s1=s.charAt(i)+s1;
			i--;
		}
		System.out.println(s1);
	}
	public static void main(String ar[])
	{
String s1="hare krishnaa jaiaed radhe vikram";
fun(s1);
	}
}