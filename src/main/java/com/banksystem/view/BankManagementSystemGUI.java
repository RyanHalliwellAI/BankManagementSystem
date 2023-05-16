package com.banksystem.view;

import javax.swing.*;
import java.awt.*;

public class BankManagementSystemGUI extends JFrame {
    public BankManagementSystemGUI() {
        setTitle("Bank Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Bank Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton createAccountButton = new JButton("Create Account");
        JButton viewAccountsButton = new JButton("View Accounts");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(createAccountButton);
        buttonPanel.add(viewAccountsButton);
        buttonPanel.add(exitButton);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
    }
}