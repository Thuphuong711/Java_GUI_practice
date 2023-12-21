package ProgressBar;

import javax.swing.*;

public class ProgressBar {
    JFrame frame = new JFrame();

    JProgressBar bar = new JProgressBar();

    ProgressBar() {
        bar.setValue(0);
        bar.setBounds(50, 50, 300, 30);
        bar.setStringPainted(true);
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420, 420);


        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int count = 0;
        while (count <= 100) {
            bar.setValue(count);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count += 1;
        }
        bar.setString("Done");

    }
}
