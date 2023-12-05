package ProjectTab.Register;

import javax.swing.*;
import java.awt.*;

public class RegisterView {

    public static void addJTextField(JFrame frame, JTextField textField, int x, int y, int width, int height , int sizeText){
        textField.setBounds(x,y,width,height);
        textField.setBackground(Color.GRAY);
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("monospace", Font.PLAIN, sizeText));
        //textField.setBorder(null);
        frame.add(textField);
    }

    public static void addButton(JFrame frame, JButton button, int x, int y, int width, int height, int sizeFont){
        button.setBounds(x,y,width,height);
        button.setFocusable(false);
        button.setBackground(new Color(168,226,255));
        button.setFont(new Font("monospace",Font.PLAIN,sizeFont));
        button.setBorder(null);
        frame.add(button);
    }

    public static void addLabel(JFrame frame, JLabel label, int x, int y, int width, int height, int sizeText, Boolean alignment){
        label.setBounds(x,y, width,height);
        label.setFont(new Font("monospace", Font.PLAIN, sizeText));

        if(alignment){
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
        }

        frame.add(label);
    }

    public static void authenticationWarning(JFrame frame, JPanel panel, JLabel label, int x, int y, int width, int height){
        label.setBounds(0,0,width,height);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("monospace", Font.PLAIN, 30));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);


        panel.setBounds(x,y,width,height);
        panel.setBackground(Color.BLACK);
        panel.setVisible(false);
        panel.setLayout(null);
        panel.add(label);
        frame.add(panel);
    }

    public static void removeComponents (JFrame frame){
        frame.getContentPane().removeAll();
        frame.repaint();
        frame.revalidate();
    }
}
