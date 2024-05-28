import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelGUI implements ActionListener{
    private JPanel panel = new JPanel();

    private ButtonsGUI buttons = new ButtonsGUI();

    private DisplayGUI displayGUI;

    private Calculator calculator = new Calculator();

    PanelGUI(DisplayGUI displayGUI){
        this.displayGUI = displayGUI;
        
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        JButton numButtons[] = buttons.getNumButtons();
        JButton actButtons[] = buttons.getActButtons();

        for(int i = 0; i < 9; i++){
            actButtons[i].addActionListener(this);
        }

        for(int i = 0; i < 10; i++){
            numButtons[i].addActionListener(this);
        }


        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(actButtons[0]);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(actButtons[1]);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(actButtons[2]);
        panel.add(actButtons[5]);
        panel.add(numButtons[0]);
        panel.add(actButtons[4]);
        panel.add(actButtons[3]);


    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++){
            if(e.getSource() == buttons.getNumButtons()[i]){
                displayGUI.setText(displayGUI.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == buttons.getDecButton()){
            displayGUI.setText(displayGUI.getText().concat("."));
        }

        if(e.getSource() == buttons.getAddButton()){
            calculator.setNum1(Double.parseDouble(displayGUI.getText()));
            calculator.setOp('+');
            displayGUI.setText("");
        }
        
        if(e.getSource() == buttons.getSubButton()){
            calculator.setNum1(Double.parseDouble(displayGUI.getText()));
            calculator.setOp('-');
            displayGUI.setText("");
        }

        if(e.getSource() == buttons.getMulButton()){
            calculator.setNum1(Double.parseDouble(displayGUI.getText()));
            calculator.setOp('*');
            displayGUI.setText("");
        }

        if(e.getSource() == buttons.getDivButton()){
            calculator.setNum1(Double.parseDouble(displayGUI.getText()));
            calculator.setOp('/');
            displayGUI.setText("");
        }

        if(e.getSource() == buttons.getEqButton()){
            calculator.setNum2(Double.parseDouble(displayGUI.getText()));
            calculator.calculation();
            displayGUI.setText(String.valueOf(calculator.getRes()));
        }

        if(e.getSource() == buttons.getClrButton()){
            displayGUI.setText("");
        }

        if(e.getSource() == buttons.getDelButton()){
            String string = displayGUI.getText();
            displayGUI.setText("");
            for(int i = 0; i < string.length()-1; i++){
                displayGUI.setText(displayGUI.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == buttons.getNegButton()){
            double temp = Double.parseDouble(displayGUI.getText());
            temp*=-1;
            displayGUI.setText(String.valueOf(temp));
        }
    }
}
        
