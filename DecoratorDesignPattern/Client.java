public class Client
{
    public static void main(String[]args)
    {
        AndroidComponent android = new AndroidComponent();
        android.setMemory(10);
        android.setCall("YES");
        android.setDisplay(32);
        
        AndroidWithCameraDecorator decorator1 = new AndroidWithCameraDecorator(android);
        
        System.out.println(decorator1.getMemory());
        System.out.println(decorator1.getCall());
        System.out.println(decorator1.getDisplay());

        decorator1.setCamera("YES have camera");
        System.out.println(decorator1.getCamera());

       
        AndoridWithCameraAndGamesDecorator decorator2 = new AndoridWithCameraAndGamesDecorator(decorator1);
        System.out.println(decorator2.getMemory());
        System.out.println(decorator2.getCall());
        System.out.println(decorator2.getDisplay());

      
        System.out.println(decorator2.getCamera());

        decorator2.setGames("Games adding....");
        System.out.println(decorator2.getGames());





          
        
    }
}