public abstract class FileInterface{

    public abstract String getName(); 

    public abstract int getSize();

    public  void addFile(FileInterface file)
    {

    }

    public void removeFile(FileInterface file)
    {
        //empty for implementation
    }

    public  abstract int  getTotalFiles();
   

    public  abstract String getContent();
   

}

    