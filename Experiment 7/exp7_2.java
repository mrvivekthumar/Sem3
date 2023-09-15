import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class canva extends Frame implements ItemListener {
    CheckboxGroup c;
    Checkbox c1, c2;
    int rs = 0;

    canva() {
        setSize(500, 500);
        setVisible(true);
        // setLayout(null);
        setLayout(new FlowLayout());
        c = new CheckboxGroup();
        c1 = new Checkbox("rectangle", c, true);
        c2 = new Checkbox("circle", c, false);

        add(c1);
        add(c2);
        c1.addItemListener(this);
        c2.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            rs = 1;
            repaint();
        }
        if (e.getSource() == c2) {
            rs = 2;
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (rs == 1) {
            g.drawRect(50, 50, 50, 50);
            g.setColor(Color.BLUE);
            g.fillRect(50, 50, 50, 50);
            rs = 0;
        }
        if (rs == 2) {
            g.drawOval(50, 50, 50, 50);
            rs = 0;
        }
    }
}

public class exp7_2 {
    public static void main(String[] args) {
        canva c = new canva();
    }
}
