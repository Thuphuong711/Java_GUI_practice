package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label = new JLabel();

    ImageIcon dizzy = new ImageIcon("src/MouseListener/dizzy.png");

    ImageIcon mask = new ImageIcon("src/MouseListener/mask.png");

    ImageIcon screaming = new ImageIcon("src/MouseListener/screaming.png");

    ImageIcon vomit = new ImageIcon("src/MouseListener/vomit.png");
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label.setBounds(0,0,200,200);
//        label.setBackground(Color.red);
//        label.setOpaque(true);

        label.setIcon(screaming);

        label.addMouseListener(this);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*
        mouse is clicked ( pressed and released)
         */

//        System.out.println("you click the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
    /*
    if we hold down a mouse button -> this method will execute
    press and hold -> the color will be pink
    if we stop press -> mouseReleased will execute
    color: green
     */
//        System.out.println("you press the mouse");
//        label.setBackground(Color.PINK);
//        label.setOpaque(true);

        label.setIcon(dizzy);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /*
        nhấn rồi thả chuột thì method này mới chạy
         */
//        System.out.println("you release the mouse");
//        label.setBackground(Color.green);
//        label.setOpaque(true);
        label.setIcon(mask);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        /*
        when mouse enters/hovers an area of component
         */
//        System.out.println("You enter the mouse");
//        label.setBackground(Color.yellow);
//        label.setOpaque(true);
        label.setIcon(vomit);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        /*
        mouse exit the area of the component
        enter and then leave -> the code below will appear
         */
//        System.out.println("you exit the component");
//        label.setBackground(Color.cyan);
//        label.setOpaque(true);
        label.setIcon(screaming);

    }
}
