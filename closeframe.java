
import java.awt.*;

import java.awt.event.*;

public class closeframe

{

public static void main(String arg[])

{

Frame f = new Frame();

f.setVisible(true);

f.setSize(500,700);

f.addWindowListener(new My3());



}

}



class My3 extends WindowAdapter

{

public void windowClosing(WindowEvent arg) { System.exit(0);

}

}
