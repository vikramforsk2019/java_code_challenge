import java.awt.*;

import java.awt.event.*;

import java.applet.*;

import javax.swing.*;



public class Light extends Applet implements ActionListener

{

Frame f = new Frame("exception");
TextField l1,l2,l3;
Button b1,b2,b3;
public void init()

{
b1=new Button("Red");

b2=new Button("Yellow");

b3=new Button("Green");

l1=new TextField(50);  
l1.setBounds(180,60,150,20);  

 
add(b1);   add(b2);
add(b3);    add(l1);   
b1.addActionListener(this);  
b2.addActionListener(this);  
b3.addActionListener(this);  
}
public void actionPerformed(ActionEvent e)

 {
 	if(e.getSource()==b1)
 l1.setText("STOP");  
	if(e.getSource()==b2)
 l1.setText("READY");
	if(e.getSource()==b3)
 l1.setText("GO");
 }
}
/*
<html>
<applet code="Light" width=700 height=100>
</applet>
</html>
*/