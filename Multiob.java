class Multiob extends Thread
{
public void run()
   {
        System.out.println(this.currentThread().getName());  
     try  {
          fun1();
          fun2();
         }
    catch(Exception e)    {
             System.out.println(e);
         }     
    }
   public static void fun1()  {
	        System.out.println("first");
    }
   public static void fun2()  {
	        System.out.println("second");
    }
  public static void main(String arg[])
   {
     Multiob ob=new  Multiob();
     Multiob ob1=new  Multiob();
      Multiob ob2=new  Multiob();
          Thread t1 = new Thread(ob);
          t1.start(); 
          Thread t2 = new Thread(ob1);
            t2.start();

          Thread t3 = new Thread(ob2);                 
          t3.start();
   }
}

