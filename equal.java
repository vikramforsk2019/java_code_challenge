//program by college alumani usa flurida
//length=-is use for array like int[], double[], String[]
//length()=:- length() method is a used for string objects. length() 

import java.util.*;
class equal
{
	public static void main(String ar[])
	{
Scanner scan=new Scanner(System.in);

	System.out.println("enter the numbers length");
	int length=scan.nextInt();
		int a[]=new int[length];
		int i=0,j=0,count=0;
	int sum1=0,sum2=0;
	System.out.println("enter the " +length+"  numbers");
	for(i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println("length::"+a.length);
	for(i=0;i<a.length;i++)
	{
System.out.println(a[i]);
	}
	System.out.println("cheking equilibrium condition::");
	for(i=0;i<a.length;i++)
	{
		sum1+=a[i];
		//System.out.println("sum1="+sum1);
		for(j=i+2;j<a.length;j++)
		{
			sum2+=a[j];

		//System.out.println("sum2="+sum2);
		}

		if(sum1==sum2)
		{
			System.out.println("position:"+(i+1)+"   ,element:"+a[i+1]);
			break;
		}
		else
			sum2=0;
			count++;

	}
	if(sum2==0)
		System.out.println("-1");
	}
}
