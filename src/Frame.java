import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Frame extends JFrame{

    final private int F_WIDTH = 420;
    final private int F_HEIGHT = 550;

    private final JButton[] numberButtons;
    private final JTextField display;
    private final JFrame mainFrame;

    private char operator = '+';
    public Frame(){

        //Hauptframe erzeugen
        mainFrame = new JFrame("Super krasser Taschenrechner");
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
        JButton delButton = new JButton("del");
        JButton clrButton = new JButton("C");

        //zur ArrayList hinzufügen
        ArrayList<JButton> operationButtons = new ArrayList<>();

        operationButtons.add(addButton);
        operationButtons.add(subButton);
        operationButtons.add(mulButton);
        operationButtons.add(divButton);
        operationButtons.add(decButton);
        operationButtons.add(equButton);
        operationButtons.add(delButton);
        operationButtons.add(clrButton);

        // operationButtons bestücken
        for(JButton fb : operationButtons) {

            fb.setFont(myFont);
            fb.setFocusable(false);
        }
        // numberButtons bestücken
        numberButtons = new JButton[10];
        for(int i = 0; i<numberButtons.length; i++) {

            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(this::appendNumberButtonTextAction);
            numberButtons[i].setFocusable(false);
        }


        delButton.setBounds(150,430,80,50);

        clrButton.setBounds(250,430,80,50);


        //Fläche für Buttons erzeugen
        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setBackground(new Color(96,123,139));
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
        display.setFont(myFont);
        display.setEditable(false);

        // alles hinzufügen
        mainFrame.add(panel);
        mainFrame.add(delButton);
        mainFrame.add(clrButton);
        mainFrame.add(display);

        // anschalten
        mainFrame.setVisible(true);

        //ActionListener
        addButton.addActionListener(this::doAddButtonAction);
        subButton.addActionListener(this::doSubButtonAction);
        mulButton.addActionListener(this::doMulButtonAction);
        divButton.addActionListener(this::doDivButtonAction);
        equButton.addActionListener(this::doEquButtonAction);
        decButton.addActionListener(this::doDecButtonAction);
        delButton.addActionListener(this::doDelButtonAction);
        clrButton.addActionListener(this::doClrButtonAction);
    }

    // Methoden zum auslösen für ActionListener
    public void doAddButtonAction(ActionEvent event){

        Calculations.operand = Double.parseDouble(display.getText());
        Calculations.calculate(Calculations.operand);
        display.setText(display.getText().concat("+"));
        operator = '+' ;
    }

    public void doSubButtonAction(ActionEvent event){

        Calculations.operand = Double.parseDouble(display.getText());
        Calculations.calculate(Calculations.operand);
        display.setText(display.getText().concat("-"));
        operator = '-' ;
    }

    public void doMulButtonAction(ActionEvent event) {

        display.setText(display.getText().concat("*"));
        operator = '*';
    }

    public void doDivButtonAction(ActionEvent event) {

        display.setText(display.getText().concat("/"));
        operator = '/';
    }

    public void doDecButtonAction(ActionEvent event) {

        display.setText(display.getText().concat("."));
        operator = '.';
    }

    public void doEquButtonAction(ActionEvent event) {

        Calculations.calculate(Calculations.operand);
        display.setText(String.valueOf(Calculations.result));
        Calculations.result = Calculations.operand;
    }


    public void doClrButtonAction(ActionEvent event) {

        display.setText("");
        Calculations.result = 0;
        Calculations.operator = '+';
    }

    public void doDelButtonAction(ActionEvent event) {

        String input = display.getText();
        display.setText("");

        for(int i=0;i<input.length()-1;i++) {

            display.setText(display.getText()+input.charAt(i));

        }

    }

    private void appendNumberButtonTextAction(ActionEvent event) {
        if (event.getSource() instanceof JButton) {
            JButton button = (JButton) event.getSource();
            String input = button.getText();
            display.setText(display.getText().concat(input));
        }
    }
}
