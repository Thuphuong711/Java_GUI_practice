package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"This is some useless infor","title", JOptionPane.ERROR_MESSAGE);
//        System.out.println(JOptionPane.showConfirmDialog(null,"Do you want to quit?","title", JOptionPane.YES_NO_CANCEL_OPTION));
//          String name =  JOptionPane.showInputDialog("What is your name");
//          System.out.println(name);
        String[] responses = {"No,you are awesome",
                "Thank you",
                "Blush"};
        ImageIcon icon = new ImageIcon(
                "C:\\IntelliJ\\Try\\src\\JOptionPane\\Heart.png");

        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                null);
    }
}
