
import javax.swing.*;

public class FrameGUI extends JFrame{
    //variables required for the GUI of the calculator
    private JFrame frame;


    private DisplayGUI displayGUI = new DisplayGUI();

    private PanelGUI panelGUI = new PanelGUI(displayGUI);

    
    FrameGUI(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // frame.add(buttons.getActButtons()[7]);
        // frame.add(buttons.getActButtons()[6]);
        // frame.add(buttons.getActButtons()[8]);

        frame.add(displayGUI);
        frame.add(panelGUI.getPanel());

        frame.setVisible(true);
    }
}
