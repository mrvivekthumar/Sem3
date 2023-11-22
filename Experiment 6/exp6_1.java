import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener {
    MyFrame() {
        super("Mouse");
        setSize(800, 800);
        setVisible(true);
        addMouseListener(this);
    }

    int a;
    int b;

    public void mouseClicked(MouseEvent e) {
        a = e.getX();
        b = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void paint(Graphics g) {
        g.drawString(a + "," + b, 50, 50);
    }
}

public class exp6_1 {
    public static void main(String[] args) {
        MyFrame m1 = new MyFrame();
    }
}
