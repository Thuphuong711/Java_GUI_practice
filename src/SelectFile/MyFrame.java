package SelectFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Select File");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.setSize(420, 420);

        button.addActionListener(this);

        this.add(button);

//        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //declare a instance of fileChooser
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));


            //Select file to open -> return integer Value
//             int res= fileChooser.showOpenDialog(null);
            int res = fileChooser.showSaveDialog(null);
            if (res == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}

/*
    Summary: JFileChooser
    method : showOpenDialog , showSaveDialog
    getSelectedFile().getAbsolutePath()
 */
