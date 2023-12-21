package Try;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider extends JFrame implements ChangeListener {
    JFrame frame = new JFrame();

    JLabel label = new JLabel("℃ = ");

    JPanel panel = new JPanel();
    JSlider slider = new JSlider(0, 100, 50);

    Slider() {
        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(420, 420);


        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTrack(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        //in ra số theo setMajor
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);

        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);
        frame.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            label.setText("℃ = " + slider.getValue());
        }

    }
}
