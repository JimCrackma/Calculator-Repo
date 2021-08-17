import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Calculator {

    JFrame mainFrame;
    JButton buttonTest;
    JPanel panel;


    Calculator(){

        mainFrame = new JFrame("Super krasser Taschenrechner");
        mainFrame.setSize(600,700);

        panel = new JPanel();

        buttonTest = new JButton("test");
        panel.add(buttonTest);

        mainFrame.add(panel);

        mainFrame.pack();
        mainFrame.setVisible(true);

    }


    public static void main(String[] args){

        Calculator calculator = new Calculator();

            }
        }
