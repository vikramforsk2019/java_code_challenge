import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;
public class fact_applet extends Applet implements ActionListener
{
TextField  input,output;
Button compute;

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

}
}


/*

<html>

<applet code="fact_applet" width=500 height=200></applet>

</html>

*/