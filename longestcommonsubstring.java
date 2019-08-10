class longestcommonsubstring
{
	public static void main(String ar[])
	{
		String s1="abcdxyzcc",s2="xyzccabcd";
		int i=0,j=0;
		
			while(j<s2.length())
           {
           	
			if(s1.charAt(i)==s2.charAt(j))
			 {
				System.out.print(s2.charAt(j));
				System.out.println(j);
				i++;j++;
			 }
			else if(j==s2.length()-2)
				j=0;
			else
			  {
			i=0;
			j++;
//System.out.println("i=="+i+""+j);
			  }
		   }
	   }
	}
