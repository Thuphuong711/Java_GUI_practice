package Textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
//        this.setSize(500,500);

        textField.setPreferredSize(new Dimension(250, 40));
        this.add(textField);
        textField.setFont(new Font("Time New Romans", Font.BOLD, 15));
        textField.setForeground(Color.CYAN);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.red);
        textField.setText("userName");

        this.setVisible(true);


        button.addActionListener(this);
        this.add(button);


        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            System.out.println(text);
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
