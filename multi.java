import java.util.*;
public class multi
{
     public static void main(String args[])
     {
          A a = new A("one");
          a.start();
     }
}

class even implements Runnable
{
     public int x;
     public even(int x)
     {
         this.x=x;
     }
     public void run()
     {
          System.out.println("Thread Name : Even Thread and "+x+" is even numbers &square of "+x+" is =" +(x*x));
     }
}

class odd implements Runnable
{
     public int x;
     public odd(int x)
     {
         this.x=x;
      }
      public void run()
      {
            System.out.println("Thread Name : odd Thread and "+x+" is odd numbers &cube of" +x+" is =" +(x*x*x));
      }
}

class A extends Thread
{
     public String tname;
     public Random r;
     public Thread t1,t2;
     A(String s)
     {
          tname=s;
      }
      public void run()
      {
         int num=0;
         r=new Random();
         try
         {
             for(int i=0;;i++)
             {
                  num=r.nextInt(1000);
                  System.out.println("Random number is "+num);
                  if(num%2==0)
                   {
                         t1=new Thread(new even(num));
                         t1.start();
                   }
                   else
                   {
                         t2=new Thread(new odd(num));
                         t2.start();
                   }
                   Thread.sleep(1000);
             }
       }
       catch(Exception e)
       {
              System.out.println(e);
       }
   }
}



