public class AdvancedRemote extends Remote 
{
  
   
   public AdvancedRemote(Device device)
   {
   // super.device = device;

     super(device); //this is the way to intialise with super constructor not direcly accessing variable.

   }

   public void mute()
   {
     super.device.setVolume(0);
   }
}