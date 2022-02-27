import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HotAndColdGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;
    int clickX;
    int clickY;
    int nextclickX;
    int nextclickY;


    public HotAndColdGame() {
        // Set up the frame
        frame = new JFrame("Mouse Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components/panels
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        frame.add(panel1, BorderLayout.NORTH);

        field1 = new JTextField();
        frame.add(field1, BorderLayout.SOUTH);




        // Set up MouseListener
        panel1.addMouseListener(new MouseListener() {
            int rx = (int) (Math.random() * 500)+1;
            int ry = (int) (Math.random() * 500)+1;
            @Override
            public void mouseClicked(MouseEvent e) {
                clickX = e.getX();
                clickY = e.getY();
                double clickdist = Math.sqrt(Math.pow(rx - clickX, 2)) + Math.pow(ry - clickY, 2);
                double click2dist = Math.sqrt(Math.pow(rx - nextclickX, 2)) + Math.pow(ry - nextclickY, 2);
                if (clickdist != 0) {
                    field1.setText("Cold");
                    nextclickX= e.getX();
                    nextclickY = e.getY();
                }
                    if (clickdist<click2dist) {
                        field1.setText("Warmer than last time");
                    }
                    if (clickdist>=click2dist){
                        field1.setText("Colder than last time");
                    }
                if (clickdist == 0) {
                    field1.setText("You got it!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HotAndColdGame s = new HotAndColdGame();
    }
}
