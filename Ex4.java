public class Ex4 extends Thread
{
    public void run(){ 
             fun1();
             Thread.sleep(4000);           
             fun2();        
    }
   public static void fun1() {
            System.out.println("first");
    }
   public static void fun2(){
            System.out.println("second");
    }
  public static void main(String arg[]){
          Ex4 ob=new Ex4();
          Thread t1 = new Thread(ob);       
          t1.start();               
   }
}
