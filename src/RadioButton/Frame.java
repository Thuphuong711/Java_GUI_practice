package RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    JRadioButton pizzaButton = new JRadioButton("Pizza");
    JRadioButton hamburgerButton = new JRadioButton("Hamburger");

    JRadioButton hotdogButton = new JRadioButton("Hotdog");

    ButtonGroup group = new ButtonGroup();

    ImageIcon pizzaIcon = new ImageIcon("src/RadioButton/pizza.png");
    ImageIcon hamburgerIcon = new ImageIcon("src/RadioButton/hamburger.png");
    ImageIcon hotdogIcon = new ImageIcon("src/RadioButton/hotdog.png");

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        pizzaButton.setIconTextGap(15);
        hamburgerButton.addActionListener(this);
        hamburgerButton.setIconTextGap(15);
        hotdogButton.addActionListener(this);
        hotdogButton.setIconTextGap(15);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);

        hotdogButton.setIcon(hotdogIcon);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("you order pizza");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("you order hamburger");
        } else System.out.println("you order hotdog");
    }
}
