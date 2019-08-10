class Ticket1 extends Thread
{
public void run()
   {
      int avail = 1;
      int req = 1; 
      if(req <= avail)
      { 
     try{
            System.out.println("available seats : "+avail+" for "+this.currentThread().getName());
         }
    catch(Exception e)     {
             System.out.println(e);
         }
         avail = avail -1 ;
       } 
else
System.out.println("not")       ;
    }
   
  public static void main(String arg[])  
 { 
     Ticket1 ob=new Ticket1();
          Thread t1 = new Thread(ob);
          Thread t2 = new Thread(ob);
          Thread t3 = new Thread(ob);
          t1.setName("om1");  
          t2.setName("om2");  
          t3.setName("om3");  
          t1.start();               
          t2.start();
          t3.start();
   }
}

