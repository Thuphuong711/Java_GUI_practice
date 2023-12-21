package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    String[] animals = {"dog", "cat", "bird"};


    //need to pass in a reference data tyoe
    //have to use Wrapper Class
    JComboBox comboBox = new JComboBox(animals);

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(comboBox);
        this.pack();

        this.setVisible(true);

        comboBox.addActionListener(this);

//        comboBox.setEditable(true);
        // return the number of items in comboBox
//        System.out.println(comboBox.getItemCount());

        // add an object (reference data type) ( e.g String)
//        comboBox.addItem("horse");

        /* add object at an index, but it is not selected
        the selected one is still dog
        * */
        comboBox.insertItemAt("pig", 0);


        //select item at Index x by default
//        comboBox.setSelectedIndex(0);

        //remove the item in comboBox
//        comboBox.removeItem("cat");

        //remove item at Index
//        comboBox.removeItemAt(3);

//        comboBox.removeAllItems();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
