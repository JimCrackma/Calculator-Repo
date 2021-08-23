public class Calculations {

    private double result = 0;
    private char operator = '+';
    private double operand; // wird später zur Abfrage der numberButtons benutzt

/*
    public void run() {
        do {
            double operand = liesZahl("Zahl: ");
            calculate(operand);
            operator = liesZeichen("Operator (\"=\" zur Ausgabe): ");
        } while (operator != '=');

        System.out.println("Ergebnis: " + ergebnis);
    }

    private double liesZahl(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException ex) {
                System.out.println("Bitte eine valide Zahl eingeben!");
            }
        }
    }

    private char liesZeichen(String prompt) {
        String line;
        do {
            System.out.print(prompt);
            line = sc.nextLine();
        } while (line.trim().isEmpty());

        return line.trim().charAt(0);
    }
*/
    private void calculate(double operand) {
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



