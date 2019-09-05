package mx.sidlors.pattern.proxy;
import java.util.HashMap;
import mx.sidlors.pattern.proxy.model.Video;

public interface ThirdPartyYoutubeLib{

 public HashMap<String, Video> popularVideos();
 public Video getVideo(String videoId);

}
