public class AndroidWithCameraDecorator extends BaseDecorator
{
    
   

   private  String camera;


    public AndroidWithCameraDecorator(MobileComponentInterface component)
    {
          super(component);
         
    }

    public void setCamera(String camera)
    {
        this.camera = camera;
    }

   public String getCamera()
  {
    return camera;
  }


}