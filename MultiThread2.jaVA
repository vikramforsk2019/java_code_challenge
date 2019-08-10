class MultiThread2 extends Thread
{
public void run()   {
        System.out.println(this.currentThread().getName());  
     try {           
             fun1();
             fun2();
         }
    catch(Exception e)      {
             System.out.println(e);
        }      
    }
   public static void fun1()   {
	        System.out.println("first");
    }
   public static void fun2()  {
	        System.out.println("second");
    }
  public static void main(String arg[])
   {
     MultiThread2 ob=new MultiThread2();
          Thread t1 = new Thread(ob);
          Thread t2 = new Thread(ob);
          t1.start();         
          t2.start();
   }
}
