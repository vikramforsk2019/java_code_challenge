import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class SampleForm implements ActionListener
{

        Frame f= new Frame("Sample Form");  
    Label user,pass,check,gender;  
    TextField user1,pass1;
    Button submit;
    TextArea text;
    Checkbox check1,check2,check3,check4;
    String check11="",check21="",check31="",check41="";
    CheckboxGroup cbg;

	SampleForm()
	{

    user=new Label("Username");      user.setBounds(50,70, 100,30);  
    user1 = new TextField();    user1.setBounds(200,70,100,30);
    
    pass=new Label("Password");     pass.setBounds(50,110, 100,30); 
    pass1=new TextField();    pass1.setBounds(200,110,100,30); 
    
    check=new Label("Select Subjects");   check.setBounds(50,150, 100,30);  
    check1 = new Checkbox("OS");    check2 = new Checkbox("JAVA"); check3 = new Checkbox("C");    check4 = new Checkbox("C++");
    check1.setBounds(200,155,50,20);
    check2.setBounds(250,155,50,20);
    check3.setBounds(300,155,50,20);
    check4.setBounds(350,155,50,20);

    gender=new Label("Gender");     gender.setBounds(50,190, 100,30); 
    cbg = new CheckboxGroup();
     Checkbox checkBox1 = new Checkbox("Male", cbg, false);    
        checkBox1.setBounds(200,190, 50,20);    
        Checkbox checkBox2 = new Checkbox("Female", cbg, true);    
        checkBox2.setBounds(260,190, 70,20);
    
 
    submit = new Button("Submit");
    submit.setBounds(150,230,80,30);
    
    text = new TextArea();
    text.setBounds(420,70,200,200);
    submit.addActionListener(this);
   
    f.add(user);    f.add(pass);      f.add(user1);    f.add(pass1);    f.add(submit);    f.add(text);   
     f.add(check);
    f.add(check1);    
     f.add(check2);   f.add(check3);   
       f.add(check4);   f.add(gender); f.add(checkBox1); f.add(checkBox2);


    f.setSize(700,400);      
    f.setLayout(null);    
    f.setVisible(true); 
    f.addWindowListener(new ForClosing());   

 }

 public void actionPerformed(ActionEvent e)
 {
     String name = user1.getText();
     String password = pass1.getText(); 
   
    // text.setText("Username : "+name+" \n"+"Password : "+password+"\n"+check11+"\n"+check21+"\n"+check31+"\n"+check41);      

    
      Statement st = null; 
            ResultSet rs = null;
            Connection con = null;
                  

    try{
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
      }
      catch(ClassNotFoundException e1)
       {
          System.out.println(e1);
       }
       catch(SQLException e2)
       {
           System.out.println(e2);
       }

       try{
       	    st = con.createStatement();
       	    st.executeUpdate("insert into demo values('"+name+"','"+password+"')");
      System.out.println("update succesfully");
       }
       catch(SQLException e3)
          {
            System.out.println(e3);
           }
        catch(Exception e4)
             {
                System.out.println(e4);
             }
             
 }
 
 public static void main(String[] args) {
 	SampleForm SF = new SampleForm();
 }

}

 class ForClosing extends WindowAdapter
{
	 
public void windowClosing(WindowEvent arg) {  
      System.exit(0);
}  

}









/*

kumawat ajay
Published on Mar 17, 2017
1. Assuming that you already have MySQL installed.
2.install the connector driver.
sudo apt-get install libmysql-java

3.  The next step is to make sure that the classpath is set. You can have this set automatically by adding this
a command to you bashrc file.

export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar

4.  If you want to set this for all users, you should modify the /etc/environment instead.



import java.sql.Connection;
import java.sql.DriverManager;
class JDBCTest {
    private static final String url = "jdbc:mysql://localhost";
    private static final String user = "username";
    private static final String password = "password";
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
