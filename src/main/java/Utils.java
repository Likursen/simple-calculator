import java.util.Scanner;

public class Utils {

    public static int scanNumber() {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printResult(String result) {
        System.out.println(result);
    }

    public static int calculateResultOfMultiplication(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }

    public static int calculateResultOfSum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }
}