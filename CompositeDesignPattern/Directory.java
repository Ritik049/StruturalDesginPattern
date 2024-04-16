import java.util.*;
public class Directory extends FileInterface
{   
    String name;
    ArrayList<FileInterface>lst = new ArrayList<>();

    public Directory(String name)
    {
        this.name =name;
    }
    public  String getName()
    {
      return this.name;
    }

    public int getSize()
    {
      int size = 0;              
      for(int i=0;i<lst.size();i++)
      {
        size+=lst.get(i).getSize();
       // System.out.println(lst.get(i).getName());
      }
      return size;
    }

    public  void addFile(FileInterface file)
    {
      lst.add(file);
    }

    public void removeFile(FileInterface file)
    {
        //empty for implementation
        lst.remove(file);
    }

    public   int  getTotalFiles()
    {
        return lst.size();
    }
   

    public  String getContent()
    {
        String  s = "";
        for(int i=0;i<lst.size();i++)
        {
            String st = lst.get(i).getContent();
            s+=st;
            s+=" ";
        }
        return s;
    }
   
}