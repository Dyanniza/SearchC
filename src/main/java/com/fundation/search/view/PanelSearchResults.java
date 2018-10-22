/*
 * Copyright (c) 2018 Jalasoft.
 *  2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *  This software is the confidential and proprietary information of  Jalasoft, ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with Jalasoft.
 */

package main.java.com.fundation.search.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.BorderLayout;

public class PanelSearchResults extends JPanel
{
    private JLabel labelResults;
    private TableModel tableModel;
    private JTable tableResults;

    private JScrollPane tableScroll;
    private String columnNames [] = {"File Name", "Location","Size", "Date Created"};

    public PanelSearchResults()
    {
        settings();
        init();
    }
    public void settings()
    {
        setBorder(BorderFactory.createTitledBorder("Search Results"));
        labelResults = new JLabel("No results found!!");
        tableModel = new DefaultTableModel();
        tableResults = new JTable(tableModel);
        setVisible(true);
    }

    public void init()
    {
        setLayout(new BorderLayout());
        tableScroll = new JScrollPane(tableResults);
        add(tableScroll, BorderLayout.CENTER);
        add(labelResults);
    }
}
