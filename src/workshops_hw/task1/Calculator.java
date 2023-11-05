package workshops_hw.task1;
public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
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
        return purchaseAmount - purchaseAmount * (discountAmount / 100); // Метод должен возвращать сумму покупки со скидкой
    }
}