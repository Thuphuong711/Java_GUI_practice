package Package3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Frame practice");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));


        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.ORANGE);

        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);


        panel5.setLayout(new BorderLayout());
        JPanel subpanel1 = new JPanel();
        JPanel subpanel2 = new JPanel();
        JPanel subpanel3 = new JPanel();
        JPanel subpanel4 = new JPanel();
        JPanel subpanel5 = new JPanel();

        subpanel1.setBackground(Color.red);
        subpanel2.setBackground(Color.CYAN);
        subpanel3.setBackground(Color.pink);
        subpanel4.setBackground(Color.green);
        subpanel5.setBackground(Color.white);

        subpanel1.setPreferredSize(new Dimension(50, 50));
        subpanel2.setPreferredSize(new Dimension(50, 50));
        subpanel3.setPreferredSize(new Dimension(50, 50));
        subpanel4.setPreferredSize(new Dimension(50, 50));
        subpanel5.setPreferredSize(new Dimension(50, 50));

        panel5.add(subpanel1, BorderLayout.NORTH);
        panel5.add(subpanel2, BorderLayout.SOUTH);
        panel5.add(subpanel3, BorderLayout.EAST);
        panel5.add(subpanel4, BorderLayout.WEST);
        panel5.add(subpanel5, BorderLayout.CENTER);


    }
}
