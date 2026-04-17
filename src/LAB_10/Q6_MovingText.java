package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q6_MovingText extends JFrame implements KeyListener, Runnable {

    private String displayText = "Type something...";
    private String inputBuffer = "";
    private int x;
    private int y = 150;
    private final int speed = 3;

    public Q6_MovingText() {
        setTitle("Moving Text - Press keys to type, text scrolls right to left");
        setSize(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);

        x = getWidth(); // start from right edge

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            x -= speed;
            // Reset to right side when text fully exits left
            Graphics g = getGraphics();
            if (g != null) {
                FontMetrics fm = g.getFontMetrics(new Font("Arial", Font.BOLD, 28));
                if (x + fm.stringWidth(displayText) < 0) {
                    x = getWidth();
                }
            }
            repaint();
            try { Thread.sleep(20); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Moving text
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD, 28));
        g.drawString(displayText, x, y);

        // Instruction + current input buffer
        g.setColor(Color.LIGHT_GRAY);
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        g.drawString("Typing: " + inputBuffer + "_", 10, getHeight() - 50);
        g.drawString("Press ENTER to set text | BACKSPACE to delete | ESC to clear", 10, getHeight() - 25);
    }

    // KeyListener
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_ENTER) {
            // Set display text and reset position
            if (!inputBuffer.isEmpty()) {
                displayText = inputBuffer;
                inputBuffer = "";
                x = getWidth();
            }
        } else if (code == KeyEvent.VK_BACK_SPACE) {
            if (!inputBuffer.isEmpty())
                inputBuffer = inputBuffer.substring(0, inputBuffer.length() - 1);
        } else if (code == KeyEvent.VK_ESCAPE) {
            inputBuffer  = "";
            displayText  = "";
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        // Accept printable characters only
        if (c >= 32 && c < 127) {
            inputBuffer += c;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Q6_MovingText().setVisible(true);
    }
}