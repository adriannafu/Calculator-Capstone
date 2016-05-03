import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Buttons on calculator (Numbers, decimal point, etc)
 * 
 * @author Adrianna Fu 
 * @version 4/13/16
 */
public class ButtonPanel extends JPanel
{
    /** array of number buttons */
    private JButton[] numButtons;
    /** the pressed number */
    private int currentNum;
    /** the panel where the buttons will be displayed */
    private DisplayPanel display;
    /** clear button */
    private JButton clear; 
    /** equals button */
    private JButton equals;
    /**
     * Initializes a new instance of the ButtonPanel class
     */
    public ButtonPanel(DisplayPanel canvas)
    {
        this.currentNum = 0;
        this.display = canvas;
        this.setLayout(new GridLayout(4,3));
        this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        this.numButtons = new JButton[10];
        this.numButtons[0] = new JButton("0");
        this.clear = new JButton("C");
        this.equals = new JButton("=");
        
        ClickListener listener = new ClickListener();
 
        for (int i = 9; i > 0; i--)
        {
            this.numButtons[i] = new JButton(String.valueOf(i));
            this.add(this.numButtons[i]);
            this.numButtons[i].addActionListener(listener);            
        }
        //this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        this.add(this.equals);
        this.add(this.clear);
        this.add(this.numButtons[0]);
            
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            switch(event.getActionCommand()) {
                case "1":
                    currentNum = 1;
                    break;
                case "2":
                    currentNum = 2;
                    break;
                case "3":
                    currentNum = 3;
                    break;
                case "4":
                    currentNum = 4;
                    break;
                case "5":
                    currentNum = 5;
                    break;
                case "6":
                    currentNum = 6;
                    break;
                case "7":
                    currentNum = 7;
                    break;
                case "8":
                    currentNum = 8;
                    break;
                case "9":
                    currentNum = 9;
                    break;
                case "0":
                    currentNum = 0;
                    break;
            }
                
        }
    }

}
