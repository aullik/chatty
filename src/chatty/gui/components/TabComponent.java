package chatty.gui.components;

import chatty.gui.components.menus.ContextMenuListener;
import chatty.gui.components.menus.TabContextMenu;

import javax.swing.*;
import java.awt.*;

/**
 * @author tduva
 */
public class TabComponent extends JPanel {

   public TabComponent(String text, ContextMenuListener listener) {
      super(new FlowLayout(FlowLayout.LEFT, 0, 0));
      JLabel label = new JLabel(text);
      add(label);
      setOpaque(false);
      label.setComponentPopupMenu(new TabContextMenu(listener));
   }
}
