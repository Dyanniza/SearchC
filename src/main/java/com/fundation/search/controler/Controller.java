/*
 * Copyright (c) 2018 Jalasoft.
 *  2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of  Jalasoft, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with Jalasoft.
 */

package main.java.com.fundation.search.controler;

import main.java.com.fundation.search.model.Search;
import main.java.com.fundation.search.view.MainWindow;
import main.java.com.fundation.search.view.PanelSearchParameters;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller
{
    private PanelSearchParameters view;
    private Search search;

    public Controller()
    {
        System.out.println("Action from Controller" );
        /*Instance the view and the search model*/
        MainWindow SearchC = new MainWindow();
        view= new PanelSearchParameters();
        search= new Search();
        System.out.println("Action after search" );
        /*this is when the action Listener is called for get the data from the view*/
        //view.getSearchPanel().getButtonSearch().addActionListener(e-> getCriteriaView());// getCriteriaView is the name of the button
        view.getButtonSearch().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(view,
                        "Search Results:\n" + " No files found");
                System.out.println("Action from Search button" );
            }
        });
    }

    //This is what the View will return when the button is pressed
    private void getCriteriaView()
    {
        System.out.print("Hello");
        /*
        //obtaining what the view is passing for the parameters
        String path =view.getPanel().getPath();  //path
        String fileName =view.getPanel().getFileName(); //filename
       // String ext =view.getPanel().getExt();//extension
       // Date dateA = view.getPanel().getDateA();//creationdate

        //This is the object that will pass to the Model the data
        List<FileResul> filesR=search.initSearch(path,fileName);

        //List<FileResult> filesR=search.initSearch(path,fileName, ext, dateA); //this is what the model is returned// sobrecargar el constructor

        //this is what the controller made for iterate all what the model is passed and set the result table

        //add un clean default model
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        while( model.getRowCount() > 0 )
        {
            model.removeRow(0);
        }

        //this cycle will go throw the objects returned by the model
        for(FileResult f: filesR)
        {
            this.view.getPanel().getModel().addRow("{"+f.getPath()+","+f.getFileName()+"}"); // this is for return the added rows in the table the values wll return.
            //System.out.println("path:"+ f.getPath()+"; filename="+ f.getFileName());
        }
        */
    }

}

