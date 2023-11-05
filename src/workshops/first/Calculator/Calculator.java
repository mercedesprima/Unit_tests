package workshops.first.Calculator;

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
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
            if(num <= 0) {
                throw new IllegalArgumentException("Square root can be accessed only of a positive number");
            }
            if (Double.isNaN(num)){
                throw new IllegalArgumentException("Input is not a number");
            }
            return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (discountAmount < 0 || purchaseAmount < 0) {
            throw new ArithmeticException("Discount amount and purchase amount should be positive numbers");
        }
        if (discountAmount >= 100) {
            throw new ArithmeticException("Discount must be less than 100%");
        }
        if (discountAmount == 0) {
            return purchaseAmount;
        }

        return purchaseAmount - purchaseAmount * ((double) discountAmount / 100); // Метод должен возвращать сумму покупки со скидкой
    }
}