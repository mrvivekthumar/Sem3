import java.awt.*;
import java.awt.event.*;

class Array extends Frame implements ActionListener {
   TextField t1;
   TextField t2;
   Button b;

   int a[] = { 2543, 453, 555, 659, 2454 };

   Array() {
      super("Exception Handeling In Array Using GUI");
      setSize(800, 800);
      setVisible(true);
      t1 = new TextField(10);
      t2 = new TextField(10);
      b = new Button("Show");
      setLayout(new GridLayout(2, 2));
      add(t1);
      add(t2);
      add(b);
      b.addActionListener(this);

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int i = Integer.parseInt(t1.getText());
      try {
         t2.setText("Ans is = " + a[i]);
      } catch (ArrayIndexOutOfBoundsException v) {
         t2.setText("Out Of Bound");
      }
   }
}

public class exp9 {
   public static void main(String[] args) {
      Array e = new Array();
   }
}
