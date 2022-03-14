package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FourWeapon extends JFrame{
    private JPanel panelMain;
    public JPanel SWpanel;
    public JPanel CApanel;
    public JPanel CLpanel;
    public JPanel BApanel;
    public JPanel TCpanel;
    public JPanel SPpanel;
    private JButton CLButton;
    private JButton SWButton;
    private JButton BAButton;
    private JButton CAButton;
    private JButton SPButton;
    private JButton TCButton;

    public FourWeapon() {
        super("Weapon picking");
        this.setContentPane(this.panelMain);
        this.pack();


        BAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourBA screen = new fourBA();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        CAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourCA screen = new fourCA();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        CLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourCL screen = new fourCL();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        SPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourSP screen = new fourSP();
                screen.setSize(750, 550);
                screen.setVisible(true);
            }
        });

        SWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourSW screen = new fourSW();
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
