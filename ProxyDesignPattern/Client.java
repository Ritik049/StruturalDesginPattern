

public class Client {
    public static void main(String[]args)
    {
        thirdPartyYouTubeLib youTubeClass = new thirdPartyYouTubeClass();
        thirdPartyYouTubeLib youTubeProxy = new cachedYouTubeClass(youTubeClass);
        youTubeManager manager = new youTubeManager(youTubeProxy);

        manager.renderPage("video1");

        manager.renderPage("video2");

      //  manager.renderListPanel();
         



    }
}
 