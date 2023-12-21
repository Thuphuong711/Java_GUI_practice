package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label = new JLabel();
    ImageIcon rocket = new ImageIcon("src/KeyListener/rocket.png");

    MyFrame() {
        label.setIcon(rocket);
        label.setBounds(0, 0, 100, 100);
        this.add(label);
//        this.setBackground(Color.CYAN);
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(420, 420);
        this.addKeyListener(this);

        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
//        switch (e.getKeyChar()) {
//            case 'a':
//                label.setLocation(label.getX() - 10, label.getY());
//                break;
//            case 'w':
//                label.setLocation(label.getX(), label.getY() - 10);
//                break;
//            case 's':
//                label.setLocation(label.getX(), label.getY() + 10);
//                break;
//            case 'd':
//                label.setLocation(label.getX() + 10, label.getY());
//                break;
//        }
        /*
        invoke when a key is typed.
        uses keyChar,
        char output
         */
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
        /*
        Invoke when a key is pressed down.
        uses keyCode
        int output
         */
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*
        called when a button is released -> can use
        both keyChar and keyCode
         */

        System.out.println("You released key char: " + e.getKeyCode());
    }
}
