import java.awt.*;

import javax.swing.*;

public class CalculatorGUI extends JFrame{
    //variables required for the GUI of the calculator
    private JFrame frame;

    private PanelGUI panelGUI = new PanelGUI();

    private ButtonsGUI buttons = new ButtonsGUI();

    private DisplayGUI displayGUI = new DisplayGUI();


    Font font = new Font("Aptos(Body)", Font.BOLD, 30);
    double num1 = 0, num2 = 0, res = 0;
    char op;
    
    CalculatorGUI(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);


        buttons.getActButtons()[6].setBounds(150, 430, 100, 50);
        buttons.getActButtons()[7].setBounds(250, 430, 100, 50);
        buttons.getActButtons()[8].setBounds(50, 430, 100, 50);


        frame.add(panelGUI.getPanel());
        frame.add(buttons.getActButtons()[7]);
        frame.add(buttons.getActButtons()[6]);
        frame.add(buttons.getActButtons()[8]);
        frame.add(displayGUI.getDisplay());
        frame.setVisible(true);
    }
/* 
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++){
            if(e.getSource() == buttons.getNumButtons()[i]){
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == buttons.getDecButton()){
            display.setText(display.getText().concat("."));
        }

        if(e.getSource() == buttons.getAddButton()){
            num1 = Double.parseDouble(display.getText());
            op = '+';
            display.setText("");
        }
        
        if(e.getSource() == buttons.getSubButton()){
            num1 = Double.parseDouble(display.getText());
            op = '-';
            display.setText("");
        }

        if(e.getSource() == buttons.getMulButton()){
            num1 = Double.parseDouble(display.getText());
            op = '*';
            display.setText("");
        }

        if(e.getSource() == buttons.getDivButton()){
            num1 = Double.parseDouble(display.getText());
            op = '/';
            display.setText("");
        }

        if(e.getSource() == buttons.getEqButton()){
            num2 = Double.parseDouble(display.getText());

            switch (op) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;

                case '*':
                    res = num1 * num2;
                    break;

                case '/':
                    res = num1 / num2;
                    break;
                
                default:
                    break;
            }
            display.setText(String.valueOf(res));
            num1=res;
        }

        if(e.getSource() == buttons.getClrButton()){
            display.setText("");
        }

        if(e.getSource() == buttons.getDelButton()){
            String string = display.getText();
            display.setText("");
            for(int i = 0; i < string.length()-1; i++){
                display.setText(display.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == buttons.getNegButton()){
            double temp = Double.parseDouble(display.getText());
            temp*=-1;
            display.setText(String.valueOf(temp));
        }
    }
*/
}
