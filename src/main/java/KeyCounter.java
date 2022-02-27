import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyCounter {
    JFrame frame;
    JLabel label;
    JTextField field1, field2;
    JButton button;
    JPanel panel1;

    public KeyCounter() {
        button = new JButton("Calculate Total Presses:");
        frame = new JFrame("Key Counter");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Type Stuff here:");
        field1 = new JTextField(15);
        field1.setHorizontalAlignment(SwingConstants.RIGHT);
        panel1 = new JPanel();
        field2 = new JTextField(15);
        field2.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(label);
        frame.add(field1);
        frame.add(button);
        frame.add(field2);





        // button.addActionListener(this);


        field1.addKeyListener(new KeyListener() {

            int x = 0;
            @Override
            public void keyTyped(KeyEvent e) {
            }


            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()>0)
                    x++;
                    field2.setText(x + "");
            }


            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        KeyCounter s = new KeyCounter();
    }


}

