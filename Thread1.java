class Thread1 extends Thread
{
public void run()
{
	System.out.println("rUNNNING");
	fun();
	try
	{
      Thread.sleep(2000);
      fun2();
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
}
public static void fun()
{
 System.out.println("task-1");	
}

public static void fun2()
{
 System.out.println("task-2");	
}
public static void main(String args[])
{
	Thread1 ob=new Thread1();
	ob.run();
	
	ob.getName();
  	System.out.println(ob.getName());
    Thread  t1=new Thread(ob);
    Thread t2=new Thread(ob);
    t1.start();
    t2.start(); 
}
}