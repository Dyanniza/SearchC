package main.java.com.fundation.search.view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame implements Runnable
{
    private PanelSearchParameters panelSearch;
    private PanelSearchResults panelResults;

    public MainWindow()
    {
        super("SearchC  - File searcher");

        panelSearch = new PanelSearchParameters();
        panelResults = new PanelSearchResults();

    }


    public void run()
    {
            setSize(600,600);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new GridLayout(1,2));
            getContentPane().add(panelSearch);
            getContentPane().add(panelResults);
            setVisible(true);

    }


}
