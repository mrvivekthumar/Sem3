public void mouseClicked(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        a = e.getX();
        b = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void paint(Graphics g) {
        // s = a + "," + b;
        g.drawString(a + "," + b, 50, 50);
    }