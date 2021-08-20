import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class Frame extends JFrame {

    private JFrame mainFrame;
    private JPanel panel;
    private JTextField display;

    public Frame(){

        //Hauptframe erzeugen
        mainFrame = new JFrame("Super krasser Taschenrechner");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(420,550);
        mainFrame.setLayout(null);

        //Fläche für Buttons erzeugen
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setBackground(Color.GRAY);

        //Display erzeugen
        display = new JTextField();
        display.setBounds(50, 25, 300, 70);
        display.setEditable(false);


        // alles hinzufügen
        mainFrame.add(panel);
        mainFrame.add(display);

        // anschalten
        mainFrame.setVisible(true);

    }

}




