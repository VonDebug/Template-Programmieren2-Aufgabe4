package org.htw.prog2.aufgabe1;

import javax.swing.*;
import java.awt.*;

public class HIVDiagnosticsGUI extends JFrame {
    public HIVDiagnosticsGUI() {

        super("HIV Diagnostics Tool");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        setLayout(layout);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1;

        add((new JLabel("Please load a mutation CSV file")), constraints);
        constraints.gridx = 1;
        constraints.weightx = 3;
        constraints.anchor = GridBagConstraints.LINE_END;

        add(new Button(), constraints);







    }

}
