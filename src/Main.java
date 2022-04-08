import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.Font.*;

public class Main{
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.cyan, 15);
        JLabel label = new JLabel();
        label.setText("yowawowa");
        JFrame frame = new JFrame();
        frame.setTitle("yowa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xCB90E0));
        frame.add(label);
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setFont(new Font("Neucha", PLAIN,100));
        label.setIconTextGap(50);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        frame.setLayout(null);
//        label.setBounds(0,0,700,700);
        frame.pack();



        frame.setVisible(true);


    }
}
