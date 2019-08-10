import java.awt.*;

import java.awt.event.*;

import java.applet.*;






public class Factorial_number extends Applet implements ActionListener

{
TextField input,output;

Button compute;

int fact=0;

public void init()

{

compute=new Button("Compute");

Label inp=new Label("Enter any number:",Label.RIGHT);

Label opt=new Label("Factorial of the given number is : ",Label.RIGHT);

input=new TextField(5);

output=new TextField(10);

add(inp);


add(input);

add(opt);

add(output);

add(compute);

output.setText("0");

output.setEditable(false);

compute.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)

{

fact=1;

int n=Integer.parseInt(input.getText()); if(n<=16){

for(int i=n;i>=2;i--)

fact=fact*i;

output.setText(""+fact);

}

else

fact=-1;



repaint();

}

public void paint(Graphics g)

{

if(fact==-1)

{

output.setText("0");

g.drawString("Sorry number exceeds greater than 16",10,100); }

}

}
