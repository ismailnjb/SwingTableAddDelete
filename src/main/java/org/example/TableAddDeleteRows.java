package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableAddDeleteRows {
    public static void main(String[] args) {
        // Create the JFrame (the main window)
        JFrame frame = new JFrame("JTable with Add/Delete Rows Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Column headers for the table
        String[] columns = {"ID", "Name", "Age"};

        // Table model to manipulate the table's data dynamically
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

        // Create a JTable with the model
        JTable table = new JTable(tableModel);

        // Add initial rows to the table
        tableModel.addRow(new Object[]{"1", "John", "25"});
        tableModel.addRow(new Object[]{"2", "Alice", "30"});
        tableModel.addRow(new Object[]{"3", "Bob", "22"});

        // Wrap the JTable in a JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a JPanel to hold the Add and Delete buttons
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Row");
        JButton deleteButton = new JButton("Delete Row");

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);



        // Action Listener for the Add button
            addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt user to enter new row data
                String id = JOptionPane.showInputDialog(frame, "Enter ID:");
                String name = JOptionPane.showInputDialog(frame, "Enter Name:");
                String age = JOptionPane.showInputDialog(frame, "Enter Age:");

                // Add new row to the table
                if (id != null && name != null && age != null) {
                    tableModel.addRow(new Object[]{id, name, age});
                }
            }
        });

        // Action Listener for the Delete button
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected row index
                int selectedRow = table.getSelectedRow();

                // Check if a row is selected
                if (selectedRow != -1) {
                    // Remove the selected row from the table model
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to delete.");
                }
            }
        });

        // Set the frame size and make it visible
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
