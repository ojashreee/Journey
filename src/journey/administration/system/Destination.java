
package journey.administration.system;

import javax.swing.*;
import java.awt.*;

public class Destination extends JFrame implements Runnable {

    JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    Thread th;

    public void run() {
        try {
            JLabel[] labels = {l2, l3, l4, l5, l6, l7, l8, l9, l10, l11};
            for (JLabel label : labels) {
                label.setVisible(true);
                Thread.sleep(2800);
                label.setVisible(false);
            }

            SwingUtilities.invokeLater(() -> this.setVisible(false));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Destination() {
        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        setLayout(null); // Move this before adding components

        th = new Thread(this);

        l2 = createImageLabel("Journey/Administration/System/icons/dest1.jpeg");
        l3 = createImageLabel("Journey/Administration/System/icons/dest2.png");
        l4 = createImageLabel("Journey/Administration/System/icons/dest3.jpg");
        l5 = createImageLabel("Journey/Administration/System/icons/dest4.jpg");
        l6 = createImageLabel("Journey/Administration/System/icons/dest5.jpg");
        l7 = createImageLabel("Journey/Administration/System/icons/dest6.jpg");
        l8 = createImageLabel("Journey/Administration/System/icons/dest7.jpeg");
        l9 = createImageLabel("Journey/Administration/System/icons/dest8.jpg");
        l10 = createImageLabel("Journey/Administration/System/icons/dest9.jpg");
        l11 = createImageLabel("Journey/Administration/System/icons/dest10.jpg");

        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);

        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false);
        l10.setVisible(false);
        l11.setVisible(false);

        th.start();
    }

    private JLabel createImageLabel(String path) {
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(path));
        Image img = icon.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(img);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(0, 0, 900, 700);
        return label;
    }

    public static void main(String args[]) {
        new Destination().setVisible(true);
    }
}
