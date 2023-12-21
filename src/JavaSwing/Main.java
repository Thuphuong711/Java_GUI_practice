//package JavaSwing;
//
//import javax.swing.*;
//import javax.swing.border.Border;
//
//import java.awt.*;
//
//import static java.awt.Font.*;
//
//public class Main {
//
//
//    public static void main(String[] args) {
////        MyFrame frame = new MyFrame();
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setVisible(true);
//        frame.setLayout(new BorderLayout(10,10));
//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
//
//        panel1.setBackground(Color.red);
//        panel2.setBackground(Color.green);
//        panel3.setBackground(Color.yellow);
//        panel4.setBackground(Color.magenta);
//        panel5.setBackground(Color.blue);
//
//        panel1.setPreferredSize(new Dimension(100,100));
//        panel2.setPreferredSize(new Dimension(100,100));
//        panel3.setPreferredSize(new Dimension(100,100));
//        panel4.setPreferredSize(new Dimension(100,100));
//        panel5.setPreferredSize(new Dimension(10,100));
//
//        frame.add(panel1, BorderLayout.NORTH);
//        frame.add(panel2, BorderLayout.SOUTH);
//        frame.add(panel3, BorderLayout.WEST);
//        frame.add(panel4, BorderLayout.EAST);
//        frame.add(panel5, BorderLayout.CENTER);
//
//        //subpanel
//        panel5.setLayout(new BorderLayout(5,5));
//
//        JPanel subpanel1 = new JPanel();
//        JPanel subpanel2 = new JPanel();
//        JPanel subpanel3 = new JPanel();
//        JPanel subpanel4 = new JPanel();
//        JPanel subpanel5 = new JPanel();
//
//        subpanel1.setBackground(Color.red);
//        subpanel2.setBackground(Color.green);
//        subpanel3.setBackground(Color.yellow);
//        subpanel4.setBackground(Color.magenta);
//        subpanel5.setBackground(Color.blue);
//
//        subpanel1.setPreferredSize(new Dimension(50,50));
//        subpanel2.setPreferredSize(new Dimension(50,50));
//        subpanel3.setPreferredSize(new Dimension(50,50));
//        subpanel4.setPreferredSize(new Dimension(50,50));
//        subpanel5.setPreferredSize(new Dimension(50,50));
//
//        panel5.add(subpanel1);
//        panel5.add(subpanel2);
//        panel5.add(subpanel3);
//        panel5.add(subpanel4);
//        panel5.add(subpanel5);
//
//        panel5.add(subpanel1, BorderLayout.NORTH);
//        panel5.add(subpanel2, BorderLayout.SOUTH);
//        panel5.add(subpanel3, BorderLayout.WEST);
//        panel5.add(subpanel4, BorderLayout.EAST);
//        panel5.add(subpanel5, BorderLayout.CENTER);
//
//
//    }
//}