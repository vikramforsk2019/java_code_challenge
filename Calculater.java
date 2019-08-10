
import javax.swing.*;

import java.awt.event.*;

class Calculater implements ActionListener

{

JFrame f;

JTextField text;

JButton

b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,division,multi,subs,addition,decimal,equal;



static double a=0,b=0,result=0;

static int operator=0;


Calculater()

{

f=new JFrame("Calculator");

text =new JTextField();

b1=new JButton("1");

b3=new JButton("3");

b5=new JButton("5");


b2=new JButton("2");

 b4=new JButton("4");

b6=new JButton("6");

b8=new JButton("8");

b0=new JButton("0");

b7=new JButton("7");
 b9=new JButton("9");



division=new JButton("/");  

 subs=new JButton("-"); 


multi=new JButton("*");

addition=new JButton("+");

decimal=new JButton("."); 

equal=new JButton("=");




text.setBounds(30,40,280,30);

b7.setBounds(40,100,50,40);

b8.setBounds(110,100,50,40);

b9.setBounds(180,100,50,40);

division.setBounds(250,100,50,40);



b4.setBounds(40,170,50,40);

b5.setBounds(110,170,50,40);

b6.setBounds(180,170,50,40);

multi.setBounds(250,170,50,40);



b1.setBounds(40,240,50,40);

b2.setBounds(110,240,50,40);

b3.setBounds(180,240,50,40);

subs.setBounds(250,240,50,40);



decimal.setBounds(40,310,50,40);



b0.setBounds(110,310,50,40);

equal.setBounds(180,310,50,40);

addition.setBounds(250,310,50,40);



f.add(text); f.add(b7); f.add(division); f.add(b4);




f.add(b8);

f.add(b5);




f.add(b9);

f.add(b6);	f.add(multi);

f.add(b1);	f.add(b2);	f.add(b3);

f.add(subs); f.add(decimal); f.add(b0); f.add(equal); f.add(addition);



f.setLayout(null);

f.setVisible(true);

f.setSize(350,450);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setResizable(false);



b1.addActionListener(this);

b2.addActionListener(this);	

b3.addActionListener(this);

b4.addActionListener(this);

b5.addActionListener(this);

b6.addActionListener(this);	

b7.addActionListener(this);

b8.addActionListener(this);

b9.addActionListener(this);

b0.addActionListener(this); 

addition.addActionListener(this); 

division.addActionListener(this);

multi.addActionListener(this); 
subs.addActionListener(this); decimal.addActionListener(this); equal.addActionListener(this);


}

public void actionPerformed(ActionEvent e)

{

if(e.getSource()==b1)

text.setText(text.getText().concat("1"));



if(e.getSource()==b2)

text.setText(text.getText().concat("2"));



if(e.getSource()==b3)

text.setText(text.getText().concat("3"));



if(e.getSource()==b4)

text.setText(text.getText().concat("4"));



if(e.getSource()==b5)

text.setText(text.getText().concat("5"));



if(e.getSource()==b6)

text.setText(text.getText().concat("6"));



if(e.getSource()==b7)

text.setText(text.getText().concat("7"));



if(e.getSource()==b8)



text.setText(text.getText().concat("8"));



if(e.getSource()==b9)

text.setText(text.getText().concat("9"));



if(e.getSource()==b0)

text.setText(text.getText().concat("0"));



if(e.getSource()==decimal) 
	text.setText(text.getText().concat("."));


if(e.getSource()==addition)

{

a=Double.parseDouble(text.getText());

operator=1;

text.setText("");

}



if(e.getSource()==subs)

{

a=Double.parseDouble(text.getText());

operator=2;

text.setText("");

}





if(e.getSource()==multi)

{

a=Double.parseDouble(text.getText());

operator=3;

text.setText("");

}



if(e.getSource()==division)

{

a=Double.parseDouble(text.getText());

operator=4;

text.setText("");

}



if(e.getSource()==equal)

{

b=Double.parseDouble(text.getText());



switch(operator)

{

case 1: result=a+b;

break;

case 2: result=a-b;

break;

case 3: result=a*b;
break;
case 4:

if(b==0)

{

JOptionPane.showMessageDialog(null,"Can notdivide by zero");

}

else{

result=a/b;

}

break;

default: result=0;

}

text.setText(""+result);

}

}



public static void main(String arg[])

{

new Calculater();

}

}





