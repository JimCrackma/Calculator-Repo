import lombok.Getter;
import lombok.Setter;


public class Calculations {

    public double result;
    @Getter @Setter
    public double displayNumber;
    public Operator operator;

    public enum Operator {
        NO_OPERATION, ADD, SUB, MUL, DIV
    }

    Calculations(){
    operator = Operator.NO_OPERATION;
    }

    protected void calculate() {

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

        }
        displayNumber = 0;
    }

    public void setOperator(Operator operator) {
        calculate();
        this.operator = operator;
    }


    public void add() {
        setOperator(Operator.ADD);
    }

    public void sub() {
        setOperator(Operator.SUB);
    }

    public void mul() {
        setOperator(Operator.MUL);
    }

    public void div() {
        setOperator(Operator.DIV);
    }

    public void equal() {
        setOperator(Operator.NO_OPERATION);
        displayNumber = result;
    }

}
