import java.awt.Frame;
import java.awt.*;
// import java.awt.Graphics.*;

class MyFrame extends Frame {
    MyFrame() {
        setVisible(true);
        setSize(1500, 1500);
    }

    public void paint(Graphics g) {
        g.drawLine(150, 100, 150, 1000);
        g.drawLine(100, 150, 1000, 150);
        int w = 160;
        int x = 140;
        for (int i = 1; i <= 10; i++) {
            g.drawString("  " + i, w, x);
            w += 70;
        }
        int y = 110;
        int z = 180;
        for (int i = 1; i <= 10; i++) {
            g.drawString("  " + i, y, z);
            z += 50;
        }

        int a = 170;
        int b = 180;
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                g.drawString((i * j) + "    ", a, b);
                a += 70;
            }
            a = 170;
            b += 50;
        }
    }
}

class exp6_2 {
    public static void main(String[] args) {
        MyFrame frm = new MyFrame();
    }
}