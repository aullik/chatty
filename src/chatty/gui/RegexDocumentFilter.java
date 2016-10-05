package chatty.gui;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.util.regex.Pattern;

/**
 * A document filter that removes text based on a regular expression.
 *
 * @author tduva
 */
public class RegexDocumentFilter extends DocumentFilter {

   private final Pattern pattern;

   public RegexDocumentFilter(String regex) {
      pattern = Pattern.compile(regex);
   }

   @Override
   public void insertString(DocumentFilter.FilterBypass fb, int off, String str, AttributeSet attr) {
      try {
         fb.insertString(off, pattern.matcher(str).replaceAll(""), attr);
      } catch (BadLocationException | NullPointerException ex) {

      }
   }

   @Override
   public void replace(DocumentFilter.FilterBypass fb, int off, int len, String str, AttributeSet attr) {
      try {
         fb.replace(off, len, pattern.matcher(str).replaceAll(""), attr);
      } catch (BadLocationException | NullPointerException ex) {

      }
   }

}