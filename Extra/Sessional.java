import java.awt.*;
import java.awt.event.*;

class Practice extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1, b2, b3;
    int rs = 0;
    int re = 0;
    boolean c = false;
    boolean f = false;

    Practice() {
        setSize(500, 500);
        setVisible(true);
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        Label L1 = new Label("Red");
        L1.setForeground(Color.RED);
        add(L1);

        gbc.gridx = 1;
        gbc.gridy = 0;
        Label L2 = new Label("Green");
        L2.setForeground(Color.BLUE);
        add(L2);

        gbc.gridx = 0;
        gbc.gridy = 1;
        t1 = new TextField(10); // Create t1
        this.add(t1, gbc); // Add t1 to the frame

        gbc.gridx = 1;
        gbc.gridy = 1;
        t2 = new TextField(10); // Create t2
        this.add(t2, gbc); // Add t2 to the frame

        gbc.gridx = 0;
        gbc.gridy = 2;
        b1 = new Button("red");
        this.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        b2 = new Button("green");
        this.add(b2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        b3 = new Button("reset");
        this.add(b3, gbc);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("red")) {
            rs++;
            c = true;
            repaint();
        }
        if (e.getActionCommand().equals("green")) {
            re++;
            f = true;
            repaint();
        }
        if (e.getActionCommand().equals("reset")) {
            rs = 0;
            re = 0;
            f = false;
            c = false;
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (c) {
            t1.setText("" + rs);
            c = false;
        } else if (f) {
            t2.setText("" + re);
            f = false;
        } else {
            t1.setText("");
            t2.setText("");
        }
    }
}

class Sessional {
    public static void main(String[] args) {
        Practice p = new Practice();
    }
}