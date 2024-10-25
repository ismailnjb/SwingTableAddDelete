package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conditional_Rendering extends JFrame {
    private int plusCount = 0;  // Counter for "+"
    private int minusCount = 0; // Counter for "-"

    private JLabel countLabel; // Label to display counts
    private JButton plusButton; // Button for "+"
    private JButton minusButton; // Button for "-"

    public Conditional_Rendering() {
        setTitle("Count + and - Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize components
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        countLabel = new JLabel("Plus: 0 | Minus: 0");

        // Add ActionListener to buttons
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plusCount++; // Increment plus count
                updateCountLabel(); // Update the label
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minusCount++; // Increment minus count
                updateCountLabel(); // Update the label
            }
        });

        // Add components to the frame
        add(plusButton);
        add(minusButton);
        add(countLabel);
    }

    private void updateCountLabel() {
        countLabel.setText("Plus: " + plusCount + " | Minus: " + minusCount);

        if (plusCount > minusCount) {
            countLabel.setForeground(Color.GREEN); // Change color to green if plus is greater
        } else if (minusCount > plusCount) {
            countLabel.setForeground(Color.RED); // Change color to red if minus is greater
        } else {
            countLabel.setForeground(Color.BLACK); // Default color if counts are equal
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Conditional_Rendering frame = new Conditional_Rendering();
                frame.setVisible(true);
            }
        });
    }
}
