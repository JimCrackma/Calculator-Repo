import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculations implements ActionListener {

    private double result = 0;
    private char operator = '+';
    private double operand; // wird später zur Abfrage der numberButtons benutzt



    private void calculate(double operand) {
        switch (operator) {
            case '+': result += operand; break;
            case '-': result -= operand; break;
            case '*': result *= operand; break;
            case '/': result /= operand; break;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
