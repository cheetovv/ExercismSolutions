class CalculatorConundrum {
    int result = 0;
    String sol;
    public String calculate(int operand1, int operand2, String operation) {

        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else if(operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        switch(operation){
            case "+":
                sol = String.format("%d %s %d = %d", operand1, operation, operand2, operand1 + operand2);
                break;
                
            case "*":
                sol = String.format("%d %s %d = %d", operand1, operation, operand2, operand1 * operand2);
                break;
                
            case "/":
                try{
                    sol = String.format("%d %s %d = %d", operand1, operation, operand2, operand1 / operand2);
                }catch (ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
               break;
            default: 
                throw new IllegalOperationException( String.format("Operation '%s' does not exist", operation));
        }
        return sol;
    }
}
