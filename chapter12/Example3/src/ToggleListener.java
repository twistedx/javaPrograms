import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ToggleListener implements ItemListener {

  private JButton next;
  private JRadioButton agree, disagree;

  public ToggleListener(JButton next, JRadioButton agree, JRadioButton disagree){
    this.next = next;
    this.agree = agree;
    this.disagree = disagree;
  }
  public void itemStateChanged(ItemEvent e) {
 //   next.setEnabled(agree.isSelected());
    if(agree.isSelected()){
      next.setEnabled(true);
    }
    if(disagree.isSelected()){
      next.setEnabled(false);
    }
  }
}
