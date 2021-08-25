import jdk.jshell.spi.ExecutionControl;
import lombok.Getter;
import lombok.Setter;


public class Calculations {

    @Getter
    public double result;
    @Getter @Setter
    public double displayNumber;

    @Getter
    public Operator operator;

    public enum Operator {
        NO_OPERATION, ADD, SUB, MUL, DIV
    }

    Calculations(){
    operator = Operator.NO_OPERATION;
    }

    protected void calculate() {
        // Execute the operator.
        switch (operator) {
            case NO_OPERATION:
                result = displayNumber;
                break;

            case ADD:
                result += displayNumber;
                break;

            case SUB:
                result -= displayNumber;
                break;

            case MUL:
                result *= displayNumber;
                break;

            case DIV:
                result /= displayNumber;
                break;

            default:
               // throw new ExecutionControl.NotImplementedException();

        }
        displayNumber = 0;
    }

    public void setOperator(Operator operator) {
        calculate();
        this.operator = operator;
    }

    public Calculations number(final double value) {
        displayNumber = value;
        return this;
    }

    public Calculations add() {
        setOperator(Operator.ADD);
        return this;
    }

    public Calculations sub() {
        setOperator(Operator.SUB);
        return this;
    }

    public Calculations mul() {
        setOperator(Operator.MUL);
        return this;
    }

    public Calculations div() {
        setOperator(Operator.DIV);
        return this;
    }

    public Calculations equal() {
        setOperator(operator.NO_OPERATION);
        displayNumber = result;
        return this;
    }

}
