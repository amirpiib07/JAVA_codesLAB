package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Q3_PenTool extends JFrame implements MouseListener, MouseMotionListener {

    // Store pairs of points (start → end) for each drag segment
    private final ArrayList<Point> startPoints = new ArrayList<>();
    private final ArrayList<Point> endPoints   = new ArrayList<>();
    private Point currentStart = null;
    private Point currentEnd   = null;

    public Q3_PenTool() {
        setTitle("Pen Tool - Click & Drag to Draw");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        // Draw all saved line segments
        for (int i = 0; i < startPoints.size(); i++) {
            g.drawLine(startPoints.get(i).x, startPoints.get(i).y,
                    endPoints.get(i).x,   endPoints.get(i).y);
        }
        // Draw current segment being dragged
        if (currentStart != null && currentEnd != null) {
            g.setColor(Color.RED);
            g.drawLine(currentStart.x, currentStart.y,
                    currentEnd.x,   currentEnd.y);
        }

        // Instruction text
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Arial", Font.PLAIN, 13));
        g.drawString("Click and drag to draw. Right-click to clear.", 10, 50);
    }

    // MouseListener
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            // Right-click clears the canvas
            startPoints.clear();
            endPoints.clear();
            currentStart = null;
            currentEnd   = null;
        } else {
            currentStart = e.getPoint();
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (currentStart != null && currentEnd != null) {
            startPoints.add(currentStart);
            endPoints.add(currentEnd);
        }
        currentStart = null;
        currentEnd   = null;
        repaint();
    }

    @Override public void mouseClicked(MouseEvent e)  {}
    @Override public void mouseEntered(MouseEvent e)  {}
    @Override public void mouseExited(MouseEvent e)   {}

    // MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e) {
        currentEnd = e.getPoint();
        repaint();
    }

    @Override public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new Q3_PenTool().setVisible(true);
    }
}