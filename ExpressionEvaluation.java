import java.util.Stack;

class ExpressionEvaluation {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char token : expression.toCharArray()) {
            if (Character.isDigit(token)) {
                operands.push(Character.getNumericValue(token));
            } else if (token == '+' || token == '-' || token == '*' || token == '/') {
                while (!operators.isEmpty() && hasHigherPrecedence(operators.peek(), token)) {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    int result = applyOperator(operand1, operand2, operator);
                    operands.push(result);
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            int result = applyOperator(operand1, operand2, operator);
            operands.push(result);
        }

        return operands.pop();
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }

    private static int applyOperator(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
