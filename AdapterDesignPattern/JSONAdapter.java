public class JSONAdapter implements InterfaceAdapter{

    XMLObject xml;

    public JSONAdapter(XMLObject xml)
    {
        this.xml = xml;
    }

    public String getConversion()
    {
        return "OBJECT "+xml.getXML() + " get converted into JSON";
    }
}