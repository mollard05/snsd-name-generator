
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.File;

public class Form extends JFrame {

    Random random = new Random();
    private JButton generateButton;
    private JLabel label;
    private JPanel Main;
    private JButton button1;
    private JButton button2;

    public Form () {
        setContentPane(Main);
        setTitle("Girls' Generation Name Generator");
        setSize(1920,1080);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.setOpaque(false);

        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button2.setFocusPainted(false);
        button2.setOpaque(false);

        generateButton.setBorderPainted(false);
        generateButton.setPreferredSize(new Dimension(200, 10));
        generateButton.setContentAreaFilled(false);
        generateButton.setFocusPainted(false);
        generateButton.setOpaque(false);

        Color newColour = new Color(245,220,224);
        Main.setBackground(newColour);

        setVisible(true);

        String soundName = "D:\\Coding\\NameGenerator\\src\\Source Images\\11 Gee.wav";
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        } catch (UnsupportedAudioFileException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            clip.open(audioInputStream);
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        clip.start();

        generateButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int r= random.nextInt(9);
                if (r==0){
                    label.setText("Taeyeon");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\taeyeon.jpg");
                    button1.setIcon(picture);
                }
                if (r==1){
                    label.setText("Jessica");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\jessica.jpg");
                    button1.setIcon(picture);
                }
                if (r==2){
                    label.setText("Sunny");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Sunny.jpg");
                    button1.setIcon(picture);
                }
                if (r==3){
                    label.setText("Tiffany");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Tiffany.jpg");
                    button1.setIcon(picture);
                }
                if (r==4){
                    label.setText("Hyoyeon");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Hyoyeon.jpg");
                    button1.setIcon(picture);
                }
                if (r==5){
                    label.setText("Yuri");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Yuri.jpg");
                    button1.setIcon(picture);
                }
                if (r==6){
                    label.setText("Sooyoung");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Sooyoung.jpg");
                    button1.setIcon(picture);
                }
                if (r==7){
                    label.setText("Yoona");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Yoona.jpg");
                    button1.setIcon(picture);
                }
                if (r==8){
                    label.setText("Seohyun");
                    Icon picture = new ImageIcon("D:\\Coding\\NameGenerator\\src\\Source Images\\Seohyun.jpg");
                    button1.setIcon(picture);
                }
            }
        });
    }



    public static void main(String[] args){
        Form myForm = new Form();
    }}
