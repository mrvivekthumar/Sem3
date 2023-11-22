import java.awt.*;
import java.awt.event.*;

public class exp10_2 extends Frame implements Runnable {
    private int ball1X, ball1Y; // Position of the first ball
    private int ball2X, ball2Y; // Position of the second ball
    private int ball3X, ball3Y; // Position of the third ball
    private int ball4X, ball4Y; // Position of the fourth ball
    private int ballSize = 20; // Size of the balls
    private int speed = 10; // Speed of the balls

    public exp10_2() {
        setSize(400, 400);
        setTitle("Moving Balls");
        setBackground(Color.white);

        // Initialize the positions of the balls
        ball1X = 50;
        ball1Y = 50;
        ball2X = 350;
        ball2Y = 50;
        ball3X = 350;
        ball3Y = 350;
        ball4X = 50;
        ball4Y = 350;

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        Thread animator = new Thread(this);
        animator.start();
    }

    public void run() {
        while (true) {
            moveBalls();
            repaint();
            try {
                Thread.sleep(100); // Delay for smoother animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void moveBalls() {
        // Move the first ball
        ball1X += speed;
        if (ball1X >= getWidth() - ballSize || ball1X <= 0) {
            speed = -speed; // Reverse direction
        }

        // Move the second ball
        ball2Y += speed;
        if (ball2Y >= getHeight() - ballSize || ball2Y <= 0) {
            speed = -speed; // Reverse direction
        }

        // Move the third ball
        ball3X -= speed;
        if (ball3X >= getWidth() - ballSize || ball3X <= 0) {
            speed = -speed; // Reverse direction
        }

        // Move the fourth ball
        ball4Y -= speed;
        if (ball4Y >= getHeight() - ballSize || ball4Y <= 0) {
            speed = -speed; // Reverse direction
        }
    }

    public void paint(Graphics g) {
        // Clear the frame
        g.clearRect(0, 0, getWidth(), getHeight());

        // Draw the balls
        g.setColor(Color.red);
        g.fillOval(ball1X, ball1Y, ballSize, ballSize);

        g.setColor(Color.blue);
        g.fillOval(ball2X, ball2Y, ballSize, ballSize);

        g.setColor(Color.green);
        g.fillOval(ball3X, ball3Y, ballSize, ballSize);

        g.setColor(Color.orange);
        g.fillOval(ball4X, ball4Y, ballSize, ballSize);
    }

    public static void main(String[] args) {
        exp10_2 app = new exp10_2();
        app.setVisible(true);
    }
}