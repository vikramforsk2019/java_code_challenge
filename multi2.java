class multi2 extends Thread
{
public void run()
{
System.out.println("thread::"+Thread.currentThread().getId());
}
public static void main(String ar[])
{
multi2 ob=new multi2();
multi2 ob1=new multi2();
//ob.run();
ob.start();
try 
{
ob.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}

ob1.run();
System.out.println("priority::"+ob.getPriority());
ob1.setPriority(6);
System.out.println("priority:"+ob1.getPriority());
}
}
