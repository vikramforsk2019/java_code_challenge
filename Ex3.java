class Ex3
{
 public static void main(String[] args) {
		int a, b, c;
		a=0;
		b=10;
          int ab[] = new int[5];
          int k;
		try{
             c=b/a;
             System.out.println(c);
		} 
		catch(ArithmeticException e){
			System.out.println("exception is "+e);
		}
		try{
		    System.out.println(ab[5]);
		}		
		catch(ArrayIndexOutOfBoundsException e1)	{
			System.out.println("exception is "+e1);
		}
		try{
           k=Integer.parseInt("vikram");
		}
		catch(NumberFormatException e2){
			System.out.println("exception is "+e2);
		}
	}
}
