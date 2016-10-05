package chatty.gui;

import javax.swing.text.MutableAttributeSet;
import java.awt.*;
import java.text.SimpleDateFormat;

/**
 * Provide style information to other objects.
 *
 * @author tduva
 */
public interface StyleServer {

   public Color getColor(String type);

   public MutableAttributeSet getStyle();

   public MutableAttributeSet getStyle(String type);

   public Font getFont();

   public SimpleDateFormat getTimestampFormat();
}
