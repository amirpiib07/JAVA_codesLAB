package LAB_10;

import javax.swing.*;
import java.awt.*;

public class Q4_ExpandingFront extends JPanel implements Runnable {

    private int fontSize = 6;
    private boolean expanding = true;
    private final String word = "SVNIT";

    public Q4_ExpandingFront() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(600, 200));
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            if (expanding) {
                fontSize += 2;
                if (fontSize >= 96) expanding = false;
            } else {
                fontSize -= 2;
                if (fontSize <= 6) expanding = true;
            }
            repaint();
            try { Thread.sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font f = new Font("Arial", Font.BOLD, fontSize);
        g.setFont(f);
        g.setColor(new Color(50, 100, 200));

        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth()  - fm.stringWidth(word)) / 2;
        int y = (getHeight() + fm.getAscent())        / 2;
        g.drawString(word, x, y);

        // Show current font size
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        g.setColor(Color.GRAY);
        g.drawString("Font Size: " + fontSize, 10, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Expanding Font");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Q4_ExpandingFront());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}