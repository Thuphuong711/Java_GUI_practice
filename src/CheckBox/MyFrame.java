package CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();
//   ImageIcon heartIcon = new ImageIcon("C:\\IntelliJ\\Try\\src\\CheckBox\\Heart.png");

    ImageIcon xIcon = new ImageIcon("C:\\IntelliJ\\Try\\src\\CheckBox\\close.png");

    ImageIcon tickIcon = new ImageIcon("C:\\IntelliJ\\Try\\src\\CheckBox\\tick.png");


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));


        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(tickIcon);
//        checkBox.setIconTextGap(50);
        button.setText("Submit");
        button.setFocusable(false);
        button.addActionListener(this);
        this.add(button);

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
