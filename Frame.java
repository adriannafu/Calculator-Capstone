import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * Attaches controls to JFrame’s content pane
 * 
 * @author Adrianna Fu 
 * @version 4/14/16
 */
public class Frame extends JFrame
{
    /** width of frame */
    private static final int FRAME_WIDTH = 600;
    /** height of frame */
    private static final int FRAME_HEIGHT = 400;
    /** buttons on calculator */
    private ButtonPanel buttons;
    /** display panel */
    private DisplayPanel canvas;
    
    /**
     * Initializes a new instance of the Frame class
     */
    public Frame()
    {
        this.canvas = new DisplayPanel();
        this.buttons = new ButtonPanel(this.canvas);
        this.setLayout(new BorderLayout());
        this.add(this.buttons, BorderLayout.CENTER);
        
        this.setTitle("Calculator");
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Creates a new DrawingEditor object which opens a window on the screen
     */
    public static void main(String args[])
    {
        Frame newWindow = new Frame();
    }
}