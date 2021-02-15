import java.util.Set;
import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Driver Lisense", "I got my driver's license last week st like we always talked about'Cause you were so excited for me To finally drive up to your house But today I drove through the suburbs Crying 'cause you weren't around");
        trackList.put("Mood", "Why you always in a mood? Fuckin' 'round, actin' brand new I ain't tryna tell you what to do But try to play it cool Baby, I ain't playing by your rules Everything look better with a view");
        trackList.put("Blinding Lights", "I've been tryin' to call I've been on my own for long enough Maybe you can show me how to love, maybe");
        trackList.put("Holy", "I hear a lot about sinners Don't think that I'll be a saint But I might go down to the river, uh Cause the way that the sky opens up when we touch Yeah, it's makin' me say");

        String name = trackList.get("Holy");

        System.out.println(name);

        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
}