package org.htw.prog2.aufgabe1;

import javax.swing.*;
import java.awt.*;

public class HIVDiagnosticsGUI extends JFrame {
    public HIVDiagnosticsGUI() {

        super("HIV Diagnostics Tool");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("resources/folder_explore.png");

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();

        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(aboutItem);
        fileMenu.add(exitItem);

        jMenuBar.add(fileMenu);

        setJMenuBar(jMenuBar);


        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 0, 0);
        add(new JLabel("Please load a mutation CSV file"), c);

        c.gridx = 1;
        c.weightx = 3;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(0, 0, 0, 30);
        add(new JButton(icon), c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 0, 0);
        add(new JLabel("Please load a reference FASTA/FASTQ file"), c);

        c.gridx = 1;
        c.weightx = 3;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(0, 0, 0, 30);
        add(new JButton(icon), c);

        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 0, 0);
        add(new JLabel("Please load a patient FASTA/FASTQ file"), c);

        c.gridx = 1;
        c.weightx = 3;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(0, 0, 0, 30);
        add(new JButton(icon), c);
    }

}
