package chatty.gui.components;

import javax.swing.*;
import java.awt.*;

/**
 * Dialog for a popout channel
 *
 * @author tduva
 */
public class ChannelDialog extends JDialog {

   public ChannelDialog(Window owner, Channel channel) {
      super(owner);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      setLayout(new BorderLayout());
      add(channel, BorderLayout.CENTER);

      setSize(new Dimension(600, 400));
   }

}
