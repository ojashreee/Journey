
package journey.administration.system;


import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckPackage extends JFrame {

    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }

    CheckPackage() {
        setBounds(550, 220, 900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] package1 = {
            "package1.jpg", "GOLD PACKAGE", "6 days and 7 Nights", "Airport Assistance at Aiport",
            "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise",
            "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"
        };
        
        String[] package2 = {
            "package2.jpg", "SILVER PACKAGE", "4 days and 3 Nights", "Toll Free and Entrance Free Tickets",
            "Meet and Greet at Airport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise",
            "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"
        };
        
        String[] package3 = {
            "package3.jpg", "BRONZE PACKAGE", "6 days and 5 Nights", "Return Airfare",
            "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet",
            "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only"
        };

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Package 1", createPackage(package1));
        tabbedPane.addTab("Package 2", createPackage(package2));
        tabbedPane.addTab("Package 3", createPackage(package3));

        add(tabbedPane, BorderLayout.CENTER);
        setVisible(true); // Make the frame visible at the end
    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.CYAN);

        // Load image safely
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/" + pack[0]));
        Image img = icon.getImage().getScaledInstance(550, 300, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img));
        imageLabel.setBounds(400, 0, 450, 420);
        p1.add(imageLabel);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblName.setBounds(50, 5, 350, 53);
        p1.add(lblName);

        int y = 70;
        for (int i = 2; i < 9; i++) {
            JLabel lbl = new JLabel(pack[i]);
            lbl.setBounds(35, y, 250, 20);
            lbl.setForeground((i % 2 == 0) ? Color.RED : Color.BLUE);
            p1.add(lbl);
            y += 40;
        }

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 250, 30);
        lblCheckInStatus.setForeground(Color.BLUE);
        p1.add(lblCheckInStatus);

        JLabel lblSpecial = new JLabel(pack[10]);
        lblSpecial.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblSpecial.setBounds(35, 460, 400, 40);
        p1.add(lblSpecial);

        JLabel lblPrice = new JLabel(pack[11]);
        lblPrice.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblPrice.setForeground(Color.RED);
        lblPrice.setBounds(600, 460, 400, 40);
        p1.add(lblPrice);

        return p1;
    }
}
