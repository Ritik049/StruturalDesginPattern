

import java.util.*;

public class thirdPartyYouTubeClass implements thirdPartyYouTubeLib
{   
    public thirdPartyYouTubeClass()
    {
        //Open for implementation
    }
    public Map<String,String>listVideos()
    {
        return new HashMap<>();
    }

    @Override
    public String getVideoInfo(String id) {
        return "Video info for id.."+id;
    }

    @Override
    public void downloadVideo(String id) {
        
      System.out.println("Downloading the video "+id);
    }

}