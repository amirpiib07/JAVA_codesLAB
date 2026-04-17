package LAB_10;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.net.URL;

//public class Q2_ImageAudio extends JApplet {
//
//    Image img;
//    AudioClip clip;
//
//    @Override
//    public void init() {
//        try {
//            URL imgURL = getClass().getResource("image.jpg");
//            if (imgURL != null)
//                img = getImage(imgURL);
//
//            URL audioURL = getClass().getResource("audio.au");
//            if (audioURL != null) {
//                clip = getAudioClip(audioURL);
//                clip.loop(); // play in loop
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        if (img != null)
//            g.drawImage(img, 10, 10, 400, 300, this);
//        else {
//            g.setColor(Color.RED);
//            g.drawString("Image not found. Place 'image.jpg' in classpath.", 20, 50);
//        }
//    }
//
//    @Override
//    public void stop() {
//        if (clip != null) clip.stop();
//    }
//}