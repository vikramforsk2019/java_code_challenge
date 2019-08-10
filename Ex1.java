class Ex1
{
 public static void main(String[] args) {
		int a, b, c;
		a=0;
		b=10;
		try{
             c=b/a;
             System.out.println(c);
		} 
		catch(ArithmeticException e)	{
			System.out.println("exception is "+e);
		}
		catch(Exception e1)	{
			System.out.println("exception "+e1);
		}
	}
}