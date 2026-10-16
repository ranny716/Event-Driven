import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAssignment extends JFrame {

    // Declare the required variables
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton changeTextButton;
    private JButton changeColorButton;

    // Constructor implementing inheritance and setup
    public SwingAssignment() {
        // Instantiate JFrame variable named 'frame' using 'this' (fulfilling inheritance)
        frame = this;
        frame.setTitle("Java Swing Assignment");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centers the window on screen

        // 1. ImageIcon addition (Make sure an 'icon.png' file is in your project root folder)
        ImageIcon appIcon = new ImageIcon("icon.png");
        frame.setIconImage(appIcon.getImage());

        // Instantiate JPanel variable named 'panel'
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
        panel.setBackground(Color.LIGHT_GRAY);

        // Instantiate JLabel variable named 'label' with the required text
        label = new JLabel("Welcome to Java Swing First Individual Assignment by Ranny Brima");
        label.setFont(new Font("Tahoma", Font.BOLD, 14));

        // Instantiate interactive buttons (Fulfilling the addition requirement)
        changeTextButton = new JButton("Change Text");
        changeColorButton = new JButton("Change Background");

        // Add functionality to change the text of the JLabel
        changeTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text successfully updated via Event Handling!");
            }
        });

        // Add functionality to change the background of the JPanel
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(135, 206, 250)); // Sky Blue
            }
        });

        // Add the label and buttons to the panel
        panel.add(label);
        panel.add(changeTextButton);
        panel.add(changeColorButton);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Main method to run the application on the Event Dispatch Thread
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAssignment();
            }
        });
    }
}