package main.java.com.fundation.search.model;

// Class created to collect the result of the search
public class FileResult
{
    private String path;
    private String fileName;
    private String ext;

    public FileResult()
    {
    }

    public void setPath(String path)
    {
       this.path = path;
    }

    public String getPath()
    {
        return this.path;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public void setExt(String ext)
    {
        this.ext = ext;
    }

    public String getExt()
    {
        return this.ext;
    }
}
