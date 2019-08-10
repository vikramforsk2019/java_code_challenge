class pre extends Thread
{

public void run()
{
	try
	{
System.out.print(5/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("arithmetic");
	}
	catch(Exception e)
	{
		System.out.println("Exception");
	}
}




	public static void main(String args[])
	{
pre ob=new pre();
ob.start();
	}


}