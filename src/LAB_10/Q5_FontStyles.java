package LAB_10;

import javax.swing.*;
import java.awt.*;

public class Q5_FontStyles extends JPanel {

    private String name;

    public Q5_FontStyles(String name) {
        this.name = name;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(700, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Style 1: Plain, size 24
        g.setColor(Color.BLUE);
        g.setFont(new Font("Serif", Font.PLAIN, 24));
        g.drawString("Plain  (size 24): " + name, 40, 80);

        // Style 2: Bold, size 36
        g.setColor(Color.RED);
        g.setFont(new Font("SansSerif", Font.BOLD, 36));
        g.drawString("Bold   (size 36): " + name, 40, 150);

        // Style 3: Italic, size 48
        g.setColor(new Color(0, 150, 0));
        g.setFont(new Font("Monospaced", Font.ITALIC, 48));
        g.drawString("Italic (size 48): " + name, 40, 230);
    }

    public static void main(String[] args) {
        // JOptionPane instead of Scanner — no blocking issue
        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Font Styles", JOptionPane.QUESTION_MESSAGE);

        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No name entered. Exiting.");
            return;
        }

        JFrame frame = new JFrame("Font Styles — " + name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Q5_FontStyles(name));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}