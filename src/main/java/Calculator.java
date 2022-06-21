public class Calculator {

    public static void main(String[] args) {
        int a = Utils.scanNumber();
        int b = Utils.scanNumber();
        int sumResult = Utils.calculateResultOfSum(a, b);
        int multiplicationResult = Utils.calculateResultOfMultiplication(a, b);
        Utils.printResult(String.valueOf(sumResult));
        Utils.printResult(String.valueOf(multiplicationResult));
    }
}