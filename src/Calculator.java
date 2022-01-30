public class Calculator {

    public static void main(String[] args) {
        EnterNumber enterNumber = new EnterNumber();
        EnterNumberOfOperation enterNumberOfOperation = new EnterNumberOfOperation();
        SelectOperation selectOperation = new SelectOperation();
        Calculate calculate = new Calculate();
        System.out.println("Enter a first number");
        double first = enterNumber.enterNumber();
        System.out.println("Enter a second number");
        double second = enterNumber.enterNumber();
        System.out.println("Enter a number of Operation( +(1). -(2), *(3), /(4) )");
        int operationNumber = enterNumberOfOperation.enterNumberOfOperation();
        calculate.resultOperation(first,second,selectOperation.getOperation(operationNumber));
    }
}
