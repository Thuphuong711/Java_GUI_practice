package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menu extends JFrame implements ActionListener {
    JMenuBar bar = new JMenuBar();

    JMenu File = new JMenu("File");

    JMenu Edit = new JMenu("Edit");

    JMenu View = new JMenu("View");

    JMenuItem Load = new JMenuItem("Load");

    JMenuItem Save = new JMenuItem("Save");

    JMenuItem Exit = new JMenuItem("Exit");

    ImageIcon saveIcon = new ImageIcon("src/Menu/Save.png");

    ImageIcon loadIcon = new ImageIcon("src/Menu/Load.png");

    ImageIcon exitIcon = new ImageIcon("src/Menu/Exit.png");

    Menu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setJMenuBar(bar);

        bar.add(File);
        bar.add(Edit);
        bar.add(View);

        File.add(Load);
        File.add(Save);
        File.add(Exit);

        Load.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);

        Load.setMnemonic(KeyEvent.VK_L); // l for load
        Save.setMnemonic(KeyEvent.VK_S); // s for save
        Exit.setMnemonic(KeyEvent.VK_E); // e for exit

        File.setMnemonic(KeyEvent.VK_F);
        Edit.setMnemonic(KeyEvent.VK_E);
        View.setMnemonic(KeyEvent.VK_V);


        Save.setIcon(saveIcon);
        Load.setIcon(loadIcon);
        Exit.setIcon(exitIcon);


        File.setFont(new Font("Times New Romans", Font.BOLD, 15));
        Edit.setFont(new Font("Times New Romans", Font.BOLD, 15));
        View.setFont(new Font("Times New Romans", Font.BOLD, 15));

        Load.setFont(new Font("Times New Romans", Font.BOLD, 15));
        Save.setFont(new Font("Times New Romans", Font.BOLD, 15));
        Exit.setFont(new Font("Times New Romans", Font.BOLD, 15));


        File.setIconTextGap(10);
        View.setIconTextGap(10);
        Edit.setIconTextGap(10);

        Load.setIconTextGap(10);
        Save.setIconTextGap(10);
        Exit.setIconTextGap(10);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Load) {
            System.out.println("The file is loaded");
        }
        if (e.getSource() == Save) {
            System.out.println("The file is saved");
        }
        if (e.getSource() == Exit) {
            System.exit(0);
        }
    }
}
