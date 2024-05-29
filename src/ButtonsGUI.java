
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class ButtonsGUI {
    private JButton[] numButtons;
    private JButton[] actButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, eqButton, delButton, clrButton, negButton;

    private Font font = new Font("Aptos(Body)", Font.BOLD, 30);
    
    public ButtonsGUI() {
        //creating buttons for the numbers
        numButtons = new JButton[10];
        for(int i = 0; i < 10; i++){
            numButtons[i] = new JButton(String.valueOf(i));
        }
        //creating different action buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        decButton = new JButton(".");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        //adding action buttons to array
        actButtons = new JButton[9];
        actButtons[0] = addButton;
        actButtons[1] = subButton;
        actButtons[2] = mulButton;
        actButtons[3] = divButton;
        actButtons[4] = eqButton;
        actButtons[5] = decButton;
        actButtons[6] = delButton;
        actButtons[7] = clrButton;
        actButtons[8] = negButton;

        //setting specific font for the buttons
        for(int i = 0; i < 9; i++){
            actButtons[i].setFont(font);
            actButtons[i].setBackground(Color.decode("#FBEAEB"));
            actButtons[i].setForeground(Color.BLACK);
            actButtons[i].setFocusable(false);
        }

        for(int i = 0; i < 10; i++){
            numButtons[i].setFont(font);
            numButtons[i].setBackground(Color.WHITE);
            numButtons[i].setForeground(Color.BLACK);
            numButtons[i].setFocusable(false);
        }

        //setting locations for certain buttons
        actButtons[6].setBounds(150, 430, 100, 50);
        actButtons[7].setBounds(250, 430, 100, 50);
        actButtons[8].setBounds(50, 430, 100, 50);
        
    }

    public JButton[] getNumButtons() {
        return numButtons;
    }

    public void setNumButtons(JButton[] numButtons) {
        this.numButtons = numButtons;
    }

    public JButton[] getActButtons() {
        return actButtons;
    }

    public void setActButtons(JButton[] actButtons) {
        this.actButtons = actButtons;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public void setSubButton(JButton subButton) {
        this.subButton = subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public void setMulButton(JButton mulButton) {
        this.mulButton = mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public void setDivButton(JButton divButton) {
        this.divButton = divButton;
    }

    public JButton getDecButton() {
        return decButton;
    }

    public void setDecButton(JButton decButton) {
        this.decButton = decButton;
    }

    public JButton getEqButton() {
        return eqButton;
    }

    public void setEqButton(JButton eqButton) {
        this.eqButton = eqButton;
    }

    public JButton getDelButton() {
        return delButton;
    }

    public void setDelButton(JButton delButton) {
        this.delButton = delButton;
    }

    public JButton getClrButton() {
        return clrButton;
    }

    public void setClrButton(JButton clrButton) {
        this.clrButton = clrButton;
    }

    public JButton getNegButton() {
        return negButton;
    }

    public void setNegButton(JButton negButton) {
        this.negButton = negButton;
    }


}

