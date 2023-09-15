import java.awt.event.*;
import java.awt.*;

class Calc extends Frame implements ActionListener {
    TextField t1, t2, Result;
    Button b1, b2, b3, b4;
    String s;

    Calc() {
        super("CALCULATOR");
        setSize(600, 600);
        setVisible(true);
        t1 = new TextField(10);
        t2 = new TextField(10);
        Result = new TextField(10);
        setLayout(new GridLayout(4, 2));
        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(Result);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        String s = e.getActionCommand();
        int ans = 0;
        if (s == "Add") {
            ans = a + b;
        }
        if (s == "Mul") {
            ans = a * b;
        }
        if (s == "Sub") {
            ans = a - b;
        }
        if (s == "Div") {
            ans = a / b;
        }

        Result.setText(ans + " ");
    }
}

public class exp7_1 {
    public static void main(String[] args) {
        Calc c = new Calc();
    }
}
