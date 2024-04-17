public abstract class BaseDecorator implements MobileComponentInterface
{
   
   protected MobileComponentInterface component;
   
    public BaseDecorator(MobileComponentInterface component)
    {
        this.component = component;
    }
    
    public int getMemory()
    {
        return component.getMemory();
    }

    public int getDisplay()
    {
        return component.getDisplay();
    }

    public String getCall()
    {
        return component.getCall();
    }
  
    
   //ADDING FEATURES

   
    
}