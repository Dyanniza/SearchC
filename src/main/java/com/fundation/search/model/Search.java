package main.java.com.fundation.search.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Search {

    private List<FileResult> result = new ArrayList<>();
    FileResult fr = new FileResult();

    public Search()
    {
    }
    // This method search by path and filename, returns a list of FileResult objects

    public List<FileResult> initSearch(String path, String filename)
    {
        File fileP = new File(path);
        File[] fileList= fileP.listFiles();
        String fileN;

        for(File f : fileList)
        {
            // If the f is directory the method is called again with the path and the filename
            if (f.isDirectory())
            {
                initSearch(f.getPath(), filename) ;
            }
            else
            {
                fileN = f.getName();
                // If filename is empty or filename found is equal to the parameter given is added to the result
                if (filename.isEmpty() || fileN.equals(filename))
                {
                    fr.setPath(f.getPath());
                    fr.setFileName(f.getName());
                    result.add(fr);
                }

              /*  if (ext){
                    break
                }*/

                //FileResult fr = new FileResult();
                    //fr.setPath(f.getPath());
                    //fr.setFileName(f.getName());
                    //result.add(fr);
                    //fr.setExt();

            }

        }

        return result;
    }
}
