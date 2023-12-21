package SelectAndOpenFile;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class OpenFile extends JFrame implements ActionListener {
    JFileChooser fileChooser = new JFileChooser();

    FileNameExtensionFilter filter = new FileNameExtensionFilter("files", "png", "jpg", "txt", "docx");

    JButton button = new JButton("Select file");


    OpenFile() {
        fileChooser.setFileFilter(filter);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.add(button);

        button.addActionListener(this);
//        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int res = fileChooser.showOpenDialog(null);
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
//            System.out.println(file);

            try {
                if (file != null) {
                    if (res == JFileChooser.APPROVE_OPTION) {
                        Desktop desktop = Desktop.getDesktop();
                        try {

                            //open and read file
                            desktop.open(file);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    } else if (res == JFileChooser.CANCEL_OPTION) {
                        System.out.println("Cancelled");
                    }
                } else {
                    System.out.println("No file is chosen");
                }
            } catch (NullPointerException exception) {
                System.out.println("File is not chosen");
            }


        }
    }
}
