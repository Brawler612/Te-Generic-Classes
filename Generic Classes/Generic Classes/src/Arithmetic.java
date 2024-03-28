public class Arithmetic {
    private Number num1, num2;

    public Arithmetic(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String performOperation(int choice) {
        switch (choice) {
            case 1:
                return "The Sum of " + num1 + " and " + num2 + " is: " + add();
            case 2:
                return "The Difference of " + num1 + " and " + num2 + " is: " + subtract();
            case 3:
                return "The Product of " + num1 + " and " + num2 + " is: " + multiply();
            case 4:
                return "The Quotient of " + num1 + " and " + num2 + " is: " + divide();
            case 5:
                return "The Minimum Value between " + num1 + " and " + num2 + " is: " + getMin();
            case 6:
                return "The Maximum Value between " + num1 + " and " + num2 + " is: " + getMax();
            default:
                return "";
        }
    }

    private double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    private double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    private double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    private double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }

    private double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    private double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}