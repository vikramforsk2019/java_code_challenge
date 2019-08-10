class multi1 extends Thread
{
public void run()
{
System.out.println("ok"+Thread.currentThread());

fun();
try 
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
fun2();
fun3();
}
public static void fun()
{
	System.out.println("first task");
}
public static void fun2()
{
	System.out.println("second task");
}
public static void fun3()
{
	System.out.println("third task");
}
public static void main(String ar[])
{
multi1 ob=new multi1();
//ob.run();


ob.start();
ob.getPriority();
System.out.println("thread name::"+ob.getName());
System.out.println("priority::"+ob.getPriority());
}
}
