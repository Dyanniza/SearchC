/*
 * Copyright (c) 2018 Jalasoft.
 *  2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *  This software is the confidential and proprietary information of  Jalasoft, ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with Jalasoft.
 */
package main.java.com.fundation.search.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.GridLayout;

public class MainWindow extends JFrame
{
    private PanelSearchParameters panelSearch;
    private PanelSearchResults panelResults;

    public MainWindow()
    {
        settings();
        init();
    }

     public void settings()
     {
         setTitle("SearchC  - File searcher");
         setSize(600,600);
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

     public void init()
     {
         panelSearch = new PanelSearchParameters();
         panelResults = new PanelSearchResults();
         getContentPane().setLayout(new GridLayout(2,2));
         getContentPane().add(panelSearch);
         getContentPane().add(panelResults);
         setVisible(true);
     }
}