

import java.util.HashMap;
import java.util.Map;

public class cachedYouTubeClass implements thirdPartyYouTubeLib {

    thirdPartyYouTubeLib  service ;
    Map<String, String>listCache;
    Map<String,String>videoCache;
    Map<String,String>downloadVideoCache;

    public cachedYouTubeClass(thirdPartyYouTubeLib service)
    {
        this.service = service;
    }

    @Override
    public Map<String, String> listVideos() {
       
        if(listCache==null)
        {
            listCache = service.listVideos();
        }
        return listCache;
    }




    @Override
    public String getVideoInfo(String id) {

        if(videoCache == null)
        {
            videoCache = new HashMap<>();
            videoCache.put(id,service.getVideoInfo(id));
        }

        if(videoCache!=null || videoCache.get(id)==null)
        {
            videoCache.put(id,service.getVideoInfo(id));
        }
       return  videoCache.get(id);
    }

    @Override
    public void downloadVideo(String id) {
       if(downloadVideoCache==null)
      {
        downloadVideoCache = new HashMap<>();
        downloadVideoCache.put(id,"Downloaded");
    
    }

       if(downloadVideoCache.get(id)==null)
       {
        service.downloadVideo(id);
       }
       else{
        System.out.println("Video is already downloaded.");
       }
    }
    
}
