package com.example.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavBarExample {

    public static void main(String[] args) {
        // Creating the frame
        JFrame frame = new JFrame("Navigation Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Creating the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Creating the File menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        
        // Creating the Edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        
        // Creating the Help menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        // Adding menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Adding the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Adding content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Welcome to the application", JLabel.CENTER);
        contentPanel.add(label, BorderLayout.CENTER);

        // Set content panel as the frame's content
        frame.add(contentPanel);

        // Open item action
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open option selected");
            }
        });

        // Save item action
        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Save option selected");
            }
        });

        // Cut item action
        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Cut option selected");
            }
        });

        // Copy item action
        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Copy option selected");
            }
        });

        // Paste item action
        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Paste option selected");
            }
        });

        // About item action
        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a basic navigation bar example.");
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}

