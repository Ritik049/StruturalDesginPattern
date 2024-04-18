import java.util.Map;

public interface thirdPartyYouTubeLib
{
    Map<String, String> listVideos();
    String getVideoInfo(String id);
    void downloadVideo(String id);

}