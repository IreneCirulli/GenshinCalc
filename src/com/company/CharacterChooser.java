package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class CharacterChooser extends JFrame {


    private JPanel panelMain;
    private JButton fivestarButton;
    private JButton fourstarButton;


    public CharacterChooser() {
        super("Character Type Chooser");
        this.setContentPane(this.panelMain);
        this.pack();

        fivestarButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                FiveWeapon screen = new FiveWeapon();
                screen.setSize(750, 500);
                screen.setVisible(true);
                try {
                    screen.SP1panel.setLayout(new FlowLayout());
                    BufferedImage spearpic1 = ImageIO.read(new File("spear.png"));
                    Image spearpic = spearpic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel picsp = new JLabel(new ImageIcon(spearpic));
                    screen.SP1panel.add(picsp);

                    screen.SW1panel.setLayout(new FlowLayout());
                    BufferedImage swordpic1 = ImageIO.read(new File("sword.png"));
                    Image swordpic = swordpic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel picsw = new JLabel(new ImageIcon(swordpic));
                    screen.SW1panel.add(picsw);

                    screen.CA1panel.setLayout(new FlowLayout());
                    BufferedImage catapic1 = ImageIO.read(new File("catalyst.png"));
                    Image catapic = catapic1.getScaledInstance(100, 112, Image.SCALE_SMOOTH);
                    JLabel picca = new JLabel(new ImageIcon(catapic));
                    screen.CA1panel.add(picca);

                    screen.CL1panel.setLayout(new FlowLayout());
                    BufferedImage clapic1 = ImageIO.read(new File("claymore.png"));
                    Image clapic = clapic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel piccl = new JLabel(new ImageIcon(clapic));
                    screen.CL1panel.add(piccl);

                    screen.BA1panel.setLayout(new FlowLayout());
                    BufferedImage bapic1 = ImageIO.read(new File("bow.png"));
                    Image bapic = bapic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel picba = new JLabel(new ImageIcon(bapic));
                    screen.BA1panel.add(picba);
                } catch (IOException g) {
                }
            }
        });

        fourstarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FourWeapon screen = new FourWeapon();
                screen.setSize(750, 500);
                screen.setVisible(true);
                try {
                    screen.SPpanel.setLayout(new FlowLayout());
                    BufferedImage spearpic1 = ImageIO.read(new File("spear.png"));
                    Image spearpic = spearpic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel picsp = new JLabel(new ImageIcon(spearpic));
                    screen.SPpanel.add(picsp);

                    screen.SWpanel.setLayout(new FlowLayout());
                    BufferedImage swordpic1 = ImageIO.read(new File("sword.png"));
                    Image swordpic = swordpic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel picsw = new JLabel(new ImageIcon(swordpic));
                    screen.SWpanel.add(picsw);

                    screen.CApanel.setLayout(new FlowLayout());
                    BufferedImage catapic1 = ImageIO.read(new File("catalyst.png"));
                    Image catapic = catapic1.getScaledInstance(100, 112, Image.SCALE_SMOOTH);
                    JLabel picca = new JLabel(new ImageIcon(catapic));
                    screen.CApanel.add(picca);

                    screen.CLpanel.setLayout(new FlowLayout());
                    BufferedImage clapic1 = ImageIO.read(new File("claymore.png"));
                    Image clapic = clapic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel piccl = new JLabel(new ImageIcon(clapic));
                    screen.CLpanel.add(piccl);

                    screen.BApanel.setLayout(new FlowLayout());
                    BufferedImage bapic1 = ImageIO.read(new File("bow.png"));
                    Image bapic = bapic1.getScaledInstance(250, 112, Image.SCALE_SMOOTH);
                    JLabel picba = new JLabel(new ImageIcon(bapic));
                    screen.BApanel.add(picba);

                } catch (IOException g) {
                }
            }
        });

    }
}
