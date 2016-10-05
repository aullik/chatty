package chatty.gui.components.settings;

import javax.swing.*;

/**
 * Simple StringSetting that just consists of a JTextField.
 *
 * @author tduva
 */
public class SimpleStringSetting extends JTextField implements StringSetting {

   public SimpleStringSetting(int size, boolean editable) {
      super(size);
      setEditable(editable);
   }

   @Override
   public String getSettingValue() {
      return getText();
   }

   @Override
   public void setSettingValue(String value) {
      setText(value);
   }

}
