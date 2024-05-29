import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class DisplayGUI extends JTextField{

    private Font font = new Font("Aptos(Body)", Font.BOLD, 30);


    DisplayGUI(){
        setBounds(50, 25, 300, 50);
        setBackground(Color.decode("#FFFFFF"));
        setFont(font);
        setEditable(false);
        
    }

    
}
