package main.java.com.fundation.search.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Search {

    private List<String> result = new ArrayList<String>();

    public Search()
    {
    }

    public List<String> initSearch(String path, String filename)
    {
        File fileP = new File(path);
        File[] fileList= fileP.listFiles();
        String fileName;

        for(File f : fileList)
        {
            if (f.isDirectory())
            {
                initSearch(f.getPath(), filename) ;
            }
            else
            {
                fileName = f.getName();
                if (fileName.equals(filename))
                {
                    result.add(f.getPath()) ;
                }
            }

        }

        return result;
    }
}
