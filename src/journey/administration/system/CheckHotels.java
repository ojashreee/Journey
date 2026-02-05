package journey.administration.system;

import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable {
    JLabel[] labels;
    JLabel caption;
    Thread th;

    public void run() {
        try {
            String[] hotelNames = {
                "JW Marriott Hotel", "Mandarin Oriental Hotel", "Four Seasons Hotel",
                "Radisson Hotel", "Classio Hotel", "The Bay Club Hotel",
                "Breeze Blows Hotel", "Quick Stop Hotel", "Happy Mornings Motel",
                "Moss View Hotel"
            };

            for (int i = 0; i < labels.length; i++) {
                final int index = i;
                SwingUtilities.invokeLater(() -> {
                    getContentPane().removeAll();
                    getContentPane().add(labels[index]);
                    caption.setText(hotelNames[index]);
                    repaint();
                    revalidate();
                });
                Thread.sleep(2800);
            }

            SwingUtilities.invokeLater(() -> setVisible(false));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CheckHotels() {
        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        setLayout(null);

        th = new Thread(this);
        caption = new JLabel();
        caption.setBounds(50, 550, 800, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);

        String[] imageFiles = {
            "hotel1.jpg", "hotel2.jpg", "hotel3.jpg", "hotel4.jpg", "hotel5.jpg",
            "hotel6.jpg", "hotel7.jpg", "hotel8.jpg", "hotel9.jpg", "hotel10.jpg"
        };

        labels = new JLabel[imageFiles.length];
        for (int i = 0; i < imageFiles.length; i++) {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/" + imageFiles[i]));
            Image img = icon.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
            labels[i] = new JLabel(new ImageIcon(img));
            labels[i].setBounds(0, 0, 900, 700);
        }

        add(labels[0]); // Show the first image initially
        th.start();
    }

    public static void main(String args[]) {
        new CheckHotels().setVisible(true);
    }
}

