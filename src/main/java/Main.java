public class Main {
    public static Double performMathOperation(OperationType operationType, Double num1, Double num2) {
        if (operationType == null || num1 == null || num2 == null) {
            throw new RuntimeException("Operation type and numbers cannot be null");
        }

        switch (operationType) {
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                return num1 / num2;
            case REMINDER:
                return num1 % num2;
            default:
                throw new RuntimeException("Please provide a valid operation type");
        }
    }
}
