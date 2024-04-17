public class HomeTheatreFacade
{
    private SubSystemDVDPlayer dvdPlayer;
    private SubSystemAmplifier amplifier;
    private SubSystemProjector projector;

    public HomeTheatreFacade(SubSystemDVDPlayer dvdPlayer, SubSystemAmplifier amplifier, SubSystemProjector projector)
    {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie)
    {
        System.out.println("Getting ready to play the movie...");
        projector.on();
        projector.setInput("DVD");
        projector.wideSceen();
        amplifier.on();
        amplifier.setVolume(9);
        amplifier.setSurroundSound();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie()
    {
        System.out.println("Shutting down the movie....");
        dvdPlayer.off();
        amplifier.off();
        dvdPlayer.off();
    }
}