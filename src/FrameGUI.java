import java.awt.Color;

import javax.swing.*;

public class FrameGUI{
    //variables required for the GUI of the calculator
    private JFrame frame;


    private DisplayGUI displayGUI;

    private ButtonsGUI buttonsGUI;

    private PanelGUI panelGUI;

    
    FrameGUI(){

        displayGUI = new DisplayGUI();
        buttonsGUI = new ButtonsGUI();
        panelGUI = new PanelGUI(displayGUI, buttonsGUI);

        frame = new JFrame("Calculator");
        frame.getContentPane().setBackground(Color.decode("#8AAAE5"));;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        frame.add(buttonsGUI.getActButtons()[7]);
        frame.add(buttonsGUI.getActButtons()[6]);
        frame.add(buttonsGUI.getActButtons()[8]);

        frame.add(displayGUI);
        frame.add(panelGUI.getPanel());
        frame.setResizable(false);
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }


    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


    public DisplayGUI getDisplayGUI() {
        return displayGUI;
    }


    public void setDisplayGUI(DisplayGUI displayGUI) {
        this.displayGUI = displayGUI;
    }


    public ButtonsGUI getButtonsGUI() {
        return buttonsGUI;
    }


    public void setButtonsGUI(ButtonsGUI buttonsGUI) {
        this.buttonsGUI = buttonsGUI;
    }


    public PanelGUI getPanelGUI() {
        return panelGUI;
    }


    public void setPanelGUI(PanelGUI panelGUI) {
        this.panelGUI = panelGUI;
    }
}
