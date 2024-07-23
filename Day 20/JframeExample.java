package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeExample {

        public static void main(String[] args) {
            // Create a new JFrame instance
            JFrame frame = new JFrame("Simple JFrame Example");

            // Set the size of the frame
            frame.setSize(400, 200);

            // Specify an action for the close button
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a label
            JLabel label = new JLabel("Hello, JFrame!", JLabel.CENTER);

            ghi// Create a button
            JButton button = new JButton("Click me!");

            // Add an action listener to the button
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Button clicked!");
                }
            });

            // Add the label and button to the frame
            frame.getContentPane().add(label, "North");
            frame.getContentPane().add(button, "South");

            // Make the frame visible
            frame.setVisible(true);
        }
    }

