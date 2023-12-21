package Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame = new JFrame("slider Demo");

    JPanel panel = new JPanel();

    JLabel label = new JLabel();


    //minimum and maximum number for slider -> starting point
    JSlider slider = new JSlider(0, 100, 50);

    SliderDemo() {
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setVisible(true);

        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        slider.setFont(new Font("MV Boli", Font.BOLD, 20));

        // make the slider vertical -> it is horizontal by default
        slider.setOrientation(SwingConstants.VERTICAL);

        label.setFont(new Font("MV Boli", Font.BOLD, 25));

        slider.addChangeListener(this);

    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }
}
