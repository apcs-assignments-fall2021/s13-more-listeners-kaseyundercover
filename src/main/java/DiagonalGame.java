import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// This should be a simple game where players are rated on how close they are able to click to
// the major diagonal (the diagonal from the top left to the bottom right)
// Each time the player clicks, they should be rated on how close they were to the diagonal
// in terms of the distance formula. For instance:
// * > 50: Bad!
// * 20 - 50: Okay
// * 10 - 20: Good
// * 5 - 10: Great
// * 1 - 5: Excellent
// * 0: Perfect!

public class DiagonalGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;

    public DiagonalGame() {
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
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                for (int i = 0; i < 500; i++) {
                    int f = x-i;

//                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) > 50) {
//                        field1.setText("Bad!");
//                    }
//                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) <= 50 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 20)) {
//                        field1.setText("Okay");
//                    }
//                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 20 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 10)) {
//                        field1.setText("Okay");
//                    }
//                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 10 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 5)) {
//                        field1.setText("Great");
//                    }
//                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 5 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 1)) {
//                        field1.setText("Excellent");
//                    }
//                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) == 0) {
//                        field1.setText("Perfect");
//                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                for (int i = 0; i < 500; i++) {
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) > 50) {
                        field1.setText("Bad!");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) <= 50 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 20)) {
                        field1.setText("Okay");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 20 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 10)) {
                        field1.setText("Okay");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 10 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 5)) {
                        field1.setText("Great");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 5 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 1)) {
                        field1.setText("Excellent");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) == 0) {
                        field1.setText("Perfect");
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                for (int i = 0; i < 500; i++) {
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) > 50) {
                        field1.setText("Bad!");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) <= 50 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 20)) {
                        field1.setText("Okay");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 20 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 10)) {
                        field1.setText("Okay");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 10 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 5)) {
                        field1.setText("Great");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) < 5 && (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) >= 1)) {
                        field1.setText("Excellent");
                    }
                    if (Math.sqrt(Math.pow(i - x, 2)) + Math.pow(i - y, 2) == 0) {
                        field1.setText("Perfect");
                    }
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                field1.setText("Hi!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                field1.setText("Bye!");
            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        DiagonalGame s = new DiagonalGame();
    }
}
