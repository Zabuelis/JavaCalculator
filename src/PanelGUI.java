import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanelGUI implements ActionListener{
    private JPanel panel;

    private ButtonsGUI buttons;

    private DisplayGUI displayGUI;

    private Calculator calculator = new Calculator();

    PanelGUI(DisplayGUI displayGUI, ButtonsGUI buttonsGUI){
        this.displayGUI = displayGUI;
        this.buttons = buttonsGUI;
        panel = new JPanel();
        
        //creating fixed layout for the panel
        panel.setBounds(50, 100, 300, 300);
        panel.setBackground(Color.decode("#8AAAE5"));
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        //implementing action listeners for the buttons
        for(int i = 0; i < 9; i++){
            buttonsGUI.getActButtons()[i].addActionListener(this);
        }

        for(int i = 0; i < 10; i++){
            buttonsGUI.getNumButtons()[i].addActionListener(this);
        }

        //adding number and action buttons to the panel
        panel.add(buttonsGUI.getNumButtons()[1]);
        panel.add(buttonsGUI.getNumButtons()[2]);
        panel.add(buttonsGUI.getNumButtons()[3]);
        panel.add(buttonsGUI.getActButtons()[0]);
        panel.add(buttonsGUI.getNumButtons()[4]);
        panel.add(buttonsGUI.getNumButtons()[5]);
        panel.add(buttonsGUI.getNumButtons()[6]);
        panel.add(buttonsGUI.getActButtons()[1]);
        panel.add(buttonsGUI.getNumButtons()[7]);
        panel.add(buttonsGUI.getNumButtons()[8]);
        panel.add(buttonsGUI.getNumButtons()[9]);
        panel.add(buttonsGUI.getActButtons()[2]);
        panel.add(buttonsGUI.getActButtons()[5]);
        panel.add(buttonsGUI.getNumButtons()[0]);
        panel.add(buttonsGUI.getActButtons()[4]);
        panel.add(buttonsGUI.getActButtons()[3]);


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
        
