package com.banksystem;

import com.banksystem.view.BankManagementSystemGUI;

public class BankManagementSystem {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            BankManagementSystemGUI gui = new BankManagementSystemGUI();
            gui.setVisible(true);
        });
    }
}