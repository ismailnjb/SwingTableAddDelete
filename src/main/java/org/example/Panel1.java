package org.example;

import org.example.AppData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel1 extends JPanel {
    public Panel1(AppData data, JPanel mainPanel, CardLayout cardLayout) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JTextField inputField = new JTextField(20);
        JButton nextButton = new JButton("Next");

        add(new JLabel("Enter text to share:"));
        add(inputField);
        add(nextButton);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.setSharedText(inputField.getText());  // Set data in model
                cardLayout.show(mainPanel, "Panel2");
            }
        });
    }
}
