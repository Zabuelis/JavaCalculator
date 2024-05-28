import java.awt.Font;

import javax.swing.JTextField;

public class DisplayGUI {
    private JTextField display = new JTextField();

    private Font font = new Font("Aptos(Body)", Font.BOLD, 30);


    DisplayGUI(){
        display.setBounds(50, 25, 300, 50);
        display.setFont(font);
        display.setEditable(false);
    }

    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }

    public void setText(String text){
        display.setText(text);
    }
    public String getText(){
        return display.getText();
    }
    
}
