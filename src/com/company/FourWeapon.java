package com.company;

import javax.swing.*;

public class FourWeapon extends JFrame{
    private JPanel panelMain;
    private JRadioButton CLRadioButton;
    private JRadioButton BARadioButton;
    private JRadioButton SPRadioButton;
    private JRadioButton SWRadioButton;
    private JRadioButton CARadioButton;
    private JRadioButton TCRadioButton;
    public JPanel SWpanel;
    public JPanel CApanel;
    public JPanel CLpanel;
    public JPanel BApanel;
    public JPanel TCpanel;
    public JPanel SPpanel;

    public FourWeapon() {
        super("Weapon picking");
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
