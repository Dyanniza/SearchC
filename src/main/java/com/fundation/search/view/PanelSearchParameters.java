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

public class PanelSearchParameters extends JPanel
{
    private JLabel labelPath;
    private JLabel labelFileName;
    private JLabel labelExtension;
    private JTextField textPath;
    private JTextField fileName;
    private JTextField extension;
    private JButton buttonSearch;
    private JPanel panelFieldNames;
    private JPanel panelInputFields;


    public PanelSearchParameters()
    {

        settings();
        init();
        getPathDialog();

    }

    public void settings()
    {
        setBorder(BorderFactory.createTitledBorder("Search Parameters"));

        labelPath = new JLabel("Path:");
        //labelPath.setSize(20,10);
        labelFileName = new JLabel("FileName:");
        labelExtension = new JLabel("Extension:");
        textPath = new JTextField(20);
        fileName = new JTextField(20);
        extension = new JTextField(20);
        buttonSearch = new JButton("Search");
        panelFieldNames = new JPanel();
        panelFieldNames.setSize(10,100);
        //panelFieldNames.setBounds(0,0,15,100);
        panelInputFields = new JPanel();
    }


    public void init()
    {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = GridBagConstraints.RELATIVE;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(2, 2, 2, 2);
        c.anchor = GridBagConstraints.EAST;


        setLayout(new GridLayout(1,2));
        add(panelFieldNames);
        add(panelInputFields);
        panelFieldNames.add(labelPath);
        panelFieldNames.add(labelFileName);
        panelFieldNames.add(labelExtension);

        panelInputFields.add(textPath);
        panelInputFields.add(fileName);
        panelInputFields.add(extension);
        panelInputFields.add(buttonSearch);


    }




    public void getPathDialog()
    {
        buttonSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(PanelSearchParameters.this,
                        "Path entered:\n" + textPath.getText());

            }
        });


    }

    public String getPath()
    {
        return textPath.getText();
    }

    public String getFileName()
    {
        return fileName.getText();
    }

    public String getExtension()
    {
        return extension.getText();
    }



}
