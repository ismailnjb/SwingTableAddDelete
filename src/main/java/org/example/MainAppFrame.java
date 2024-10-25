package org.example;

import javax.swing.*;
import java.awt.*;



public class MainAppFrame extends JFrame {
    public MainAppFrame() {
        setTitle("Data Sharing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        AppData data = new AppData();   // Centralized data model
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        mainPanel.add(new Panel1(data, mainPanel, cardLayout), "Panel1");
        mainPanel.add(new Panel2(data, mainPanel, cardLayout), "Panel2");
        mainPanel.add(new Panel3(data, mainPanel, cardLayout), "Panel3");

        add(mainPanel);
        cardLayout.show(mainPanel, "Panel1");  // Show the first panel initially
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainAppFrame frame = new MainAppFrame();
            frame.setVisible(true);
        });
    }
}


