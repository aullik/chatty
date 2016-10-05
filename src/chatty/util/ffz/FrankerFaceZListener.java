package chatty.util.ffz;

import chatty.util.api.EmoticonUpdate;
import chatty.util.api.usericons.Usericon;

import java.util.List;
import java.util.Set;

/**
 * @author tduva
 */
public interface FrankerFaceZListener {

   /**
    * This may be called out of a lock on the WebsocketClient instance, if
    * originating from there.
    *
    * @param emotes
    */
   public void channelEmoticonsReceived(EmoticonUpdate emotes);

   public void usericonsReceived(List<Usericon> icons);

   public void botNamesReceived(Set<String> botNames);

   public void wsInfo(String info);

   public void authorizeUser(String code);

   public void wsUserInfo(String info);
}
