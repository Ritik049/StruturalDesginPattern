public class AndroidComponent implements MobileComponentInterface
{
    int memory;
    int display;
    String call;
    
 

    public void setMemory(int memory)
    {
        this.memory = memory;
    }
    public void setDisplay(int display)
    {
        this.display = display;
    }
    public void setCall(String call)
    {
        this.call = call;
    }
 
    
    @Override
     public int getDisplay()
     {
        return display;

     }
     
     @Override
     public int getMemory()
     {
        return memory;
     }


     @Override
     public String  getCall()
     {
        return call;
     }
    
}