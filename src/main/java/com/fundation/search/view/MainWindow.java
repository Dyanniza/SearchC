package main.java.com.fundation.search.view;

import javax.swing.*;
import java.awt.*;

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
         getContentPane().setLayout(new GridLayout(1,2));
         getContentPane().add(panelSearch);
         getContentPane().add(panelResults);
         setVisible(true);
     }



}
