public class AndoridWithCameraAndGamesDecorator extends BaseDecorator {
    
    String  games ;

   

    public AndoridWithCameraAndGamesDecorator(MobileComponentInterface component)
    {
        super(component);
    }


    public String getCamera()
    {
        if(component instanceof AndroidWithCameraDecorator)
        {
            return ((AndroidWithCameraDecorator)component).getCamera();        //Doing typecasting.
        }
        return "There is no camera attached to given component";
    }

    public void setGames(String games)
    {
        this.games = games;
    }


    public String getGames()
    {
       return games;
    }


    
}
