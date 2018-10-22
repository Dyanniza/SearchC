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

public class Validator
{
    String path;
    String filename;

    // constructor
    public Validator()
    {
        this.path= null;
        this.filename=null;
    }

    /* This method validate if the path and file name have an empty path or file
    */
    public String dataempty(String path,String fname)
    {
        String res = null;
        if (path.trim().isEmpty() && fname.trim().isEmpty())
        {
            res=("You entered an empty path and file");

        }
        else
        {

            if (path.trim().isEmpty())
            {
                res=("You entered an empty path");
            }
            else
            {
                if (fname.trim().isEmpty())
                {
                    res=("You entered an empty file name");
                }
                else
                {
                    res=("Search: "+fname+" on path: "+ path);
                }
            }

        }

        return res;
    }

    /* This method validate if the file entered has the correct format
     */
    public boolean isValidfile(String file)

    {
        String fileRegex = "(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";

        Pattern pat = Pattern.compile(fileRegex);
        if (file == null)
            return false;
        return pat.matcher(file).matches();
    }

    /* This method validate if the directory entered has the correct format
     */
    public boolean isValidDirectory(String dir)

    {
        String dirRegex = "^[a-zA-Z]:\\\\(((?![<>:\"/\\\\|?*]).)+((?<![ .])\\\\)?)*$";

        if (dir.matches(dirRegex))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
