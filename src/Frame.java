import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;


public class Frame extends JFrame{

    final private int F_WIDTH = 420;
    final private int F_HEIGHT = 550;

    public Frame(){

        //Hauptframe erzeugen
        JFrame mainFrame = new JFrame("Super krasser Taschenrechner");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(F_WIDTH,F_HEIGHT);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);

        //Schriftart
        Font myFont = new Font("Arial",Font.ITALIC,30);

        //Buttons erzeugen
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton decButton = new JButton(".");
        JButton equButton = new JButton("=");
        JButton delButton = new JButton("Del");
        JButton clrButton = new JButton("Clr");

        //zur ArrayList hinzufügen
        ArrayList<JButton> functionButtons = new ArrayList<>();

        functionButtons.add(addButton);
        functionButtons.add(subButton);
        functionButtons.add(mulButton);
        functionButtons.add(divButton);
        functionButtons.add(decButton);
        functionButtons.add(equButton);
        functionButtons.add(delButton);
        functionButtons.add(clrButton);

        // functionButtons bestücken
        for(JButton fb : functionButtons) {

            fb.setFont(myFont);
            fb.setFocusable(false);
        }

        JButton[] numberButtons = new JButton[10];
        for(int i = 0; i<10; i++) {

            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        //Fläche für Buttons erzeugen
        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setBackground(new Color(96,123,139));

        //Layout
        panel.setLayout(new GridLayout(4,4,10,10));


        // Fläche bestücken
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);



        //Display erzeugen
        JTextField display = new JTextField();
        display.setBounds(50, 25, 300, 70);
        display.setEditable(false);

        // alles hinzufügen
        mainFrame.add(panel);
        mainFrame.add(display);

        // anschalten
        mainFrame.setVisible(true);

    }


}