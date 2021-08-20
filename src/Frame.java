import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;


public class Frame extends JFrame {

    private JFrame mainFrame;
    private JPanel panel;
    private JTextField display;

    private JButton buttonTest;
    private JButton[] numberButtons = new JButton[10];
    ArrayList<JButton> functionButtons = new ArrayList<>();

    private JButton addButton, subButton, mulButton, divButton,
                    decButton, equButton, delButton, clrButton;

    public Frame(){

        //Hauptframe erzeugen
        mainFrame = new JFrame("Super krasser Taschenrechner");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(420,550);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);

        //Schriftart
        Font myFont = new Font("Arial",Font.ITALIC,30);

        //Buttons erzeugen
        buttonTest = new JButton();
        buttonTest.setText("Test");

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");

        //ArrayList hinzufügen
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

        for(int i =0;i<10;i++) {

            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
        }

        //Fläche für Buttons erzeugen
        panel = new JPanel();
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