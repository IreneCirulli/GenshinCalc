package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FiveWeapon extends JFrame{
    private JPanel panelMain;
    public JPanel CL1panel;
    public JPanel SW1panel;
    public JPanel SP1panel;
    public JPanel BA1panel;
    public JPanel CA1panel;
    public JPanel TC1panel;
    private JButton CLButton;
    private JButton SWButton;
    private JButton BAButton;
    private JButton CAButton;
    private JButton SPButton;
    private JButton TCButton;

    public FiveWeapon() {
        super("Weapon Picker");
        this.setContentPane(this.panelMain);
        this.pack();

        BAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveBA screen = new fiveBA();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        CAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveCA screen = new fiveCA();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        CLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveCL screen = new fiveCL();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        SPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveSP screen = new fiveSP();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        SWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveSW screen = new fiveSW();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        TCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NotAvailable screen = new NotAvailable();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

    }
}
