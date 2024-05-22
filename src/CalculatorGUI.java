import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    //variables required for the GUI of the calculator
    private JFrame frame;
    private JTextField display;
    private JButton[] numButtons;
    private JButton[] actButtons;
    private JPanel panel;
    Font font = new Font("Aptos(Body)", Font.BOLD, 30);

    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, eqButton, delButton, clrButton, negButton;

    double num1 = 0, num2 = 0, res = 0;
    char op;
    
    CalculatorGUI(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        display = new JTextField();
        display.setBounds(50, 25, 300, 50);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);

        //implementing action buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        decButton = new JButton(".");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

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

        for(int i = 0; i < 9; i++){
            actButtons[i].addActionListener(this);
            actButtons[i].setFont(font);
            actButtons[i].setFocusable(false);
        }

        //implementing number buttons
        numButtons = new JButton[10];
        for(int i = 0; i < 10; i++){
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(font);
            numButtons[i].setFocusable(false);
        }

        //creating panel
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        //setting buttons into their place in the panel
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);



        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);
        negButton.setBounds(50, 430, 100, 50);

        frame.add(panel);
        frame.add(clrButton);
        frame.add(delButton);
        frame.add(negButton);
        frame.add(display);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 10; i++){
            if(e.getSource() == numButtons[i]){
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == decButton){
            display.setText(display.getText().concat("."));
        }

        if(e.getSource() == addButton){
            num1 = Double.parseDouble(display.getText());
            op = '+';
            display.setText("");
        }
        
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(display.getText());
            op = '-';
            display.setText("");
        }

        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(display.getText());
            op = '*';
            display.setText("");
        }

        if(e.getSource() == divButton){
            num1 = Double.parseDouble(display.getText());
            op = '/';
            display.setText("");
        }

        if(e.getSource() == eqButton){
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

        if(e.getSource() == clrButton){
            display.setText("");
        }

        if(e.getSource() == delButton){
            String string = display.getText();
            display.setText("");
            for(int i = 0; i < string.length()-1; i++){
                display.setText(display.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == negButton){
            double temp = Double.parseDouble(display.getText());
            temp*=-1;
            display.setText(String.valueOf(temp));
        }
    }

}
