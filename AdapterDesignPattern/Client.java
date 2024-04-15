public class Client
{
    public static void main(String[]args)
    {   
        XMLObject xml = new XMLObject();
        InterfaceAdapter adapter = new JSONAdapter(xml);
        
        System.out.println(adapter.getConversion());
    }
}