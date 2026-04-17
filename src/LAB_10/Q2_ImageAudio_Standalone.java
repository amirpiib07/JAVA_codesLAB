package LAB_10;

import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;

public class Q2_ImageAudio_Standalone extends JPanel {

    private Image img;

    public Q2_ImageAudio_Standalone() {
        setPreferredSize(new Dimension(500, 400));

        // Load image
        File imgFile = new File("image.jpg");
        if (imgFile.exists()) {
            img = new ImageIcon(imgFile.getAbsolutePath()).getImage();
        }

        // Play audio in loop
        playAudio("audio.wav");
    }

    private void playAudio(String filename) {
        try {
            File audioFile = new File(filename);
            if (!audioFile.exists()) {
                System.out.println("Audio file not found: " + filename);
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.out.println("Audio error: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null)
            g.drawImage(img, 10, 10, 480, 360, this);
        else {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 14));
            g.drawString("Place 'image.jpg' in project folder", 50, 200);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image + Audio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Q2_ImageAudio_Standalone());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}