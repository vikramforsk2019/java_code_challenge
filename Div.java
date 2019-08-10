import java.awt.*;

import java.awt.event.*;

import java.applet.*;

import javax.swing.*;



public class Div extends Applet implements ActionListener

{

Frame f = new Frame("exception");

TextField num1,num2,res;Label l1,l2,l3;

Button div;

public void init()

{

l1=new Label("Number 1"); num1=new TextField(10); l2=new Label("Number 2"); num2=new TextField(10);

div=new Button("DIV");

l3=new Label("result"); res=new TextField(10); res.setText("0");




res.setEditable(false);

div.addActionListener(this);

add(l1); add(num1); add(l2); add(num2); add(div);

add(l3);	add(res);



}

public void actionPerformed(ActionEvent ae)

{

String s1=num1.getText();

String s2=num2.getText();

try{

int num1=Integer.parseInt(s1);

int num2=Integer.parseInt(s2);



if(num2==0)

{

num1 = num1/num2;

}

else

{

int num3=num1/num2;

res.setText(String.valueOf(num3));

}

}



catch(Exception e){

JOptionPane.showMessageDialog(f,e);

res.setText("0");

}

}

}
/*
<html>
<applet code="Div" width=700 height=100>
</applet>
</html>
*/
