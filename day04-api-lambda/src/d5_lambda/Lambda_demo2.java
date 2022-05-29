package d5_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lambda_demo2 {
    public static void main(String[] args) {
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        JButton button = new JButton("点击");
        button.addActionListener( e -> System.out.println("控制向前"));
        win.add(panel);
        panel.add(button);
        panel.setSize(50,50);
        win.setSize(400,500);
        win.setVisible(true);
    }
}
