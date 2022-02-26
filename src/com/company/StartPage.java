package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartPage extends JFrame{
    private JPanel panelMain;
    private JButton ccButton;
    private JLabel mainLabel;


    public StartPage() {
        super("Genshin Impact Calculator Project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        ccButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharacterChooser screen = new CharacterChooser();
                screen.setSize(700, 450);
                screen.setVisible(true);
            }
        });
    }
}
