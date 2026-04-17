package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class q1_DigitalClockApplet extends JPanel implements Runnable {

    private String timeStr = "";
    private String dateStr = "";

    public q1_DigitalClockApplet() {
        setBackground(Color.BLACK);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            SimpleDateFormat timeFmt = new SimpleDateFormat("hh:mm:ss a");
            SimpleDateFormat dateFmt = new SimpleDateFormat("EEE, dd MMM yyyy");
            timeStr = timeFmt.format(new Date());
            dateStr = dateFmt.format(new Date());
            repaint();
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Date
        g.setColor(Color.CYAN);
        g.setFont(new Font("Courier New", Font.PLAIN, 20));
        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(dateStr)) / 2;
        g.drawString(dateStr, x, getHeight() / 2 - 30);

        // Time (digital look)
        g.setColor(Color.GREEN);
        g.setFont(new Font("Courier New", Font.BOLD, 60));
        fm = g.getFontMetrics();
        x = (getWidth() - fm.stringWidth(timeStr)) / 2;
        g.drawString(timeStr, x, getHeight() / 2 + 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.add(new q1_DigitalClockApplet());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}