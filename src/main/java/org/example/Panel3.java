package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel3 extends JPanel {
    public Panel3(AppData data, JPanel mainPanel, CardLayout cardLayout) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel finalTextLabel = new JLabel("Final Shared Text: " + data.getSharedText());
        JButton backButton = new JButton("Back to Start");

        add(finalTextLabel);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Panel1");
            }
        });
    }
}
