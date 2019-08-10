import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class red implements ActionListener
{
   Frame f= new Frame("Sample Form");  
    Label user,pass,check,gender;  
    TextField user1,pass1;
    Button submit;
    TextArea text;
    Checkbox check1,check2,check3,check4;
    String check11="",check21="",check31="",check41="";
    CheckboxGroup cbg;
    red()
    {
 gender=new Label("Traffic Light");   
   gender.setBounds(50,190, 100,30); 
    cbg = new CheckboxGroup();
     Checkbox checkBox1 = new Checkbox("RED", cbg, false);    
        checkBox1.setBounds(200,190, 50,20);    
        Checkbox checkBox2 = new Checkbox("GREEN", cbg, true);    
        checkBox2.setBounds(260,190, 70,20);

        Checkbox checkBox3= new Checkbox("yellow", cbg, true);    
        checkBox2.setBounds(260,200, 70,20);
         f.add(gender);
        f.add(checkBox1); f.add(checkBox2);
        f.add(checkBox3);



    f.setSize(700,400);      
    f.setLayout(null);    
    f.setVisible(true); 
     

    }
  public void actionPerformed(ActionEvent e)
 {
   
   }
   public static void main(String[] args) 
   {
 	red s = new red();
   }
}

