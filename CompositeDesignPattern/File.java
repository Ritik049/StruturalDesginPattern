import java.util.*;
public class File extends FileInterface
{   
    String name;
    int size;
    String content;
  
    public File(String name, int size)
    {
        this.name = name;
        this.size = size;
    }

    public  String getName()
    {
        return name;
    }

    public  int getSize()
    {
        return size;
    }
    
    public void setContent(String content)
    {
        this.content = content;
    }

    public  void addFile(FileInterface file)
    {
         System.out.println("Choose Directory  for removing the file");
    }

    public void removeFile(FileInterface file)
    {
        System.out.println("Choose Directory for removing the file");
    }

    public   int  getTotalFiles()
    {
        return 1;
    }
   

    public   String getContent()
    {
      return this.content;
    }
}