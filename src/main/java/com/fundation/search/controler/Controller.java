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

package com.fundation.search.controler;

public class Controller
{
    private View view;
    private Search search;

    public Controller()
    {
        /*Instance the view and the search model*/
        view= new View();
        search= new Search();

        /*this is when the action Listener is called for get the data from the view*/
        view.getPanel().getButton().addActionListener(e-> getCriteriaView());// getCriteriaView is the name of the button

    }

    //This is what the View will return when the button is pressed
    private void getCriteriaView()
    {
        //System.out.print("Hello");

        String path =View.getPanel().getPath();  //this is what the view is given me path
        String fileName =View.getPanel().getFileName(); //this is what the view is given me filename

        List<FileS> filesR=search.searchfiles(path,fileName); //this is what the model is returned

        //this is what the controller made for iterate all what the model is passed and set the result table

        for(files f: filesR)
        {
            System.out.println("path:"+ f.getpath+"; filename="+ f.getpath());
        }


    }
}
