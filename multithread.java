class multithread extends Thread
{
public void run()
{
System.out.println("ok"+Thread.currentThread());
}
public static void main(String ar[])
{
multithread ob=new multithread();
//ob.run();

try 
{
ob.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
ob.start();
ob.getPriority();
}
}
