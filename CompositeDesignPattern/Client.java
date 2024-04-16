public class Client
{
    public static void main(String[]args)
    {
        File  file1 = new File("file1", 10);
        File file2 = new File("file2",20);
        File  file3 = new File("file3",40);

        file1.setContent("Hello I am file1");
        file2.setContent("Hello I am file2");
        file3.setContent("Hello I am file3");

        FileInterface Dir1 = new Directory("Dir1");
        Dir1.addFile(file1);
        Dir1.addFile(file2);

        FileInterface Dir2 = new Directory("Dir2");
        Dir2.addFile(file3);

        Dir1.addFile(Dir2);

        System.out.println(Dir1.getSize());
        
        // System.out.println(Dir1.getContent());

        // Dir1.removeFile(Dir2);

        // System.out.println(Dir1.getContent());

        
    }
}