class validdate
{
	static int max=2250;
	static int min=1000;
	static boolean validdate(int d,int m,int y)
	{
		if(y>max||y<min)
       return false;
   if(m>12||m<1)
   	return false;
   if(d>31||d<1)
   	return false;
   if(m==2)
   {
   	if(leap(y))
   		return (d<=29);
   else 
   	return (d<=28);
   }
   if(m==4||m==6||m==9||m==11)
   	return (d<=30);
else
	return true;
	}
	static boolean leap(int y)
	{
    if((y%4==0&&y%100!=0)||y%400==0)
	    return true;
    else 
	    return false;
	}
	public static void main(String ar[])
	{
		if(validdate(31,4,2000))
			System.out.println("okk");
		else
			System.out.println("enter a valid date");
	}
}