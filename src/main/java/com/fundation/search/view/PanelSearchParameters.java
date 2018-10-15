/*
 * Copyright (c) 2018 Jalasoft.
 *  2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of  Jalasoft, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with Jalasoft.
 *
 *
 *
 */

package main.java.com.fundation.search.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class PanelSearchParameters extends JPanel
{
    private JLabel labelPath;
    private JLabel labelFileName;
    private JLabel labelExtension;
    private JTextField textPath;
    private JTextField fileName;
    private JTextField extension;
    private JButton buttonSearch;

    public PanelSearchParameters()
    {
        setBorder(BorderFactory.createTitledBorder("Search Parameters"));

        labelPath = new JLabel("Path:");
        labelFileName = new JLabel("FileName:");
        labelExtension = new JLabel("Extension:");
        textPath = new JTextField(20);
        fileName = new JTextField(20);
        extension = new JTextField(20);
        buttonSearch = new JButton("Search");
        addCompoments();
        getPath();

    }

    public void addCompoments()
    {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(20,20,50,10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(labelPath,constraints);

        constraints.gridx = 1;
        add(textPath, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(labelFileName, constraints);

        constraints.gridx = 1;
        add(fileName, constraints);

        constraints.gridx = 3;
        constraints.gridy = 3;
        add(labelExtension, constraints);

        constraints.gridx = 1;
        add(extension, constraints);

        constraints.gridx = 5;
        constraints.gridy = 5;
        constraints.gridwidth = 3;
        constraints.anchor = GridBagConstraints.CENTER;
        add (buttonSearch, constraints);
    }

    public void addCompoments2()
    {
        add(labelPath,BorderLayout.LINE_START);
        add(textPath, BorderLayout.AFTER_LAST_LINE);
        add(labelFileName, BorderLayout.AFTER_LAST_LINE);
        add(fileName, BorderLayout.AFTER_LAST_LINE);
        add(labelExtension,BorderLayout.AFTER_LAST_LINE);
        add(extension, BorderLayout.AFTER_LAST_LINE);
        add (buttonSearch, BorderLayout.CENTER);
    }


    public void getPath()
    {
        buttonSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(PanelSearchParameters.this,
                        "Path entered:\n" + textPath.getText());

            }
        });


    }

}
