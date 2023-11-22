import java.awt.*;
import java.awt.event.*;

public class exp8_1 extends Frame implements ItemListener {

    int rs = 0;
    Checkbox c1, c2, c3;

    exp8_1() {
        setSize(1000, 1000);
        setVisible(true);
        setLayout(new FlowLayout());
        CheckboxGroup cbg = new CheckboxGroup();
        c1 = new Checkbox("Red", cbg, false);
        c2 = new Checkbox("Yellow", cbg, false);
        c3 = new Checkbox("Green", cbg, false);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void paint(Graphics g) {
        g.drawOval(90, 90, 20, 20);
        g.drawOval(90, 125, 20, 20);
        g.drawOval(90, 160, 20, 20);

        if (rs == 1) {
            g.setColor(Color.RED);
            g.fillOval(90, 90, 20, 20);
        } else if (rs == 2) {
            g.setColor(Color.YELLOW);
            g.fillOval(90, 125, 20, 20);
        } else if (rs == 3) {
            g.setColor(Color.GREEN);
            g.fillOval(90, 160, 20, 20);
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            rs = 1;
            repaint();
        } else if (e.getSource() == c2) {
            rs = 2;
            repaint();
        } else if (e.getSource() == c3) {
            rs = 3;
            repaint();
        }
    }

    public static void main(String[] args) {
        exp8_1 t = new exp8_1();
    }
}