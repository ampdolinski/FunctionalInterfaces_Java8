package today_tasks._0_calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        AddOperation operation = new AddOperation();
        calculator.calculate(3, 7, operation);

        calculator.calculate(10, 20, (x, y) -> x + y);
        calculator.calculate(5, 5, (x, y) -> x * y);

    }

}
