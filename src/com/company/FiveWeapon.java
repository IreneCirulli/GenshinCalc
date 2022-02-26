package com.company;

import javax.swing.*;

public class FiveWeapon extends JFrame{
    private JPanel panelMain;
    private JRadioButton SWRadioButton;
    private JRadioButton BARadioButton;
    private JRadioButton CARadioButton;
    private JRadioButton SPRadioButton;
    private JRadioButton TCRadioButton;
    public JPanel CL1panel;
    public JPanel SW1panel;
    public JPanel SP1panel;
    public JPanel BA1panel;
    public JPanel CA1panel;
    public JPanel TC1panel;
    private JRadioButton CLRadioButton;

    public FiveWeapon() {
        super("Weapon Picker");
        this.setContentPane(this.panelMain);
        this.pack();

        ButtonGroup radiobuttonGroup = new ButtonGroup();
        radiobuttonGroup.add(SWRadioButton);
        radiobuttonGroup.add(BARadioButton);
        radiobuttonGroup.add(CARadioButton);
        radiobuttonGroup.add(SPRadioButton);
        radiobuttonGroup.add(CLRadioButton);


    }

}
