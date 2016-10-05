package chatty.gui.components.settings;

import java.util.List;

/**
 * @param <T>
 * @author tduva
 */
public interface ListSetting<T> {

   public List<T> getSettingValue();

   public void setSettingValue(List<T> value);
}
