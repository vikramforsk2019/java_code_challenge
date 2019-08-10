class Ticket2 extends Thread
{
  int avail = 2;
      int req = 1; 
public void run()
   {
    synchronized(this)
    {
        fun();
System.out.println("okk::"+avail);
    }
  }
     void fun(){     
      if(req <= avail)
      { 
     try
         {
            System.out.println("available seats : "+avail+" for "+this.currentThread().getName());
            Thread.sleep(1000);
         }
    catch(Exception e) {
             System.out.println(e);
         }
         avail = avail -1 ;
       } 
       else{
        System.out.println("seats is not available");
       }       
    }
     
  public static void main(String arg[])
   { 
     Ticket2 ob=new Ticket2();
          Thread t1 = new Thread(ob);
          Thread t2 = new Thread(ob);
          Thread t3 = new Thread(ob);
          t1.setName("ram1"); 
          t2.setName("ram2");  
          t3.setName("ram3");  
          t1.start();               
          t2.start();
          t3.start();
   }
}

