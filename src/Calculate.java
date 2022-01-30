class Calculate {

    public void resultOperation(double x, double y, Operation operation) {
        try {
            System.out.println(x + " " + operation.getSign() + " " + y + " = " + operation.performCalculation(x, y));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
