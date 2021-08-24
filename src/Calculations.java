public class Calculations {

    public static double result = 0;
    public static char operator = '+';
    public static double operand;

    Calculations(){

    }

    public static void calculate( double operand) {
        switch (operator) {
            case '+':
                result += operand;
                break;
            case '-':
                result -= operand;
                break;
            case '*':
                result *= operand;
                break;
            case '/':
                result /= operand;
                break;
        }
    }
}



