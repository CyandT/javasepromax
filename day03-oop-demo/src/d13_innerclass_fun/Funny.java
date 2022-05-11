package d13_innerclass_fun;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funny {
    public static void main(String[] args) {
        /**
         * 创建一个窗口了解匿名内部类
         */
        //1.创建窗口对象
        JFrame jFrame = new JFrame("登陆界面");
        //2.创建一个桌布自动适应按键大小
        JPanel jPanel  = new JPanel();
        jFrame.add(jPanel); 

        //3.创建按键对象
        JButton jButton = new JButton("登录");
        //注意:匿名内部类的使用
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame,"点我一下,说明爱我!");
            }
        });
        jPanel.add(jButton);

        //4.设置窗口尺寸,以及展示窗口
        jFrame.setSize(300,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
