public class Client
{
    public static void main(String[]args)
    {
        SubSystemAmplifier amplifer = new SubSystemAmplifier();
        SubSystemDVDPlayer dvdPlayer  = new SubSystemDVDPlayer();
    
        SubSystemProjector projector = new  SubSystemProjector();

        HomeTheatreFacade facade = new HomeTheatreFacade(dvdPlayer, amplifer, projector);

       // facade.watchMovie("Animal");
       facade.endMovie();

    }
}