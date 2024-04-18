

import java.util.*;

public class youTubeManager
{
    private thirdPartyYouTubeLib service;

    public youTubeManager(thirdPartyYouTubeLib service)
    {
        this.service = service;
    }

    public void renderPage(String id)
    {
        String info = service.getVideoInfo(id);
        System.out.println(info);
    }
    public void renderListPanel()
    {
        Map<String,String>lst = service.listVideos();

        for(Map.Entry<String,String>e:lst.entrySet())
        {
           System.out.println("id: "+e.getKey()+"  "+"value "+e.getValue());
        }
    }

    public void reactOnUserInput(String id)
   {
       renderPage(id);
       renderListPanel();
   }

}