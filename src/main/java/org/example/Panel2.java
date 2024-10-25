package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel2 extends JPanel {
    public Panel2(AppData data, JPanel mainPanel, CardLayout cardLayout) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel sharedTextLabel = new JLabel("Shared Text: " + data.getSharedText());
        JButton nextButton = new JButton("Next");

        add(sharedTextLabel);
        add(nextButton);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Panel3");
            }
        });
    }
}
