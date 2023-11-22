import java.awt.*;

public class exp10_1 extends Frame implements Runnable {
    int x = 100, y = 200, flag = 1;

    exp10_1() {
        setSize(800, 800);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {
        x = x + 10 * flag;
        if (x > 500) {
            flag = -1;
        }
        if (x < 100) {
            flag = 1;
        }
        y = y + 10 * flag;
        if (y > 800) {
            flag = -1;
        }
        if (y < 20) {
            flag = 1;
        }
        g.drawString("Vivek Thumar", x, 200);
        g.drawString("Vivek Thumar", 200, y);
    }

    public static void main(String[] args) {
        exp10_1 f = new exp10_1();
        Thread t = new Thread(f);
        t.start();

    }

}
