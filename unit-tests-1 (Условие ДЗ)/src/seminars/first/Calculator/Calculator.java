package seminars.first.Calculator;

public class Calculator {

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
            default:
                throw new IllegalStateException("Неожиданный оператор: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Невозможно вычислить квадратный корень отрицательного числа");
        }
        return Math.sqrt(num);
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Недопустимая сумма покупки или процент скидки");
        }
        return purchaseAmount - (purchaseAmount * discountAmount / 100.0);
    }
}