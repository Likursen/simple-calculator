public class Calculator {

    public static void main(String[] args) {
        int a = Utils.scanNumber();
        int b = Utils.scanNumber();
        Utils.printSumResult(a, b);
        Utils.printMultiplyResult(a, b);
    }
}