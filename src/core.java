import java.util.Locale;
import java.util.Scanner;

public class core {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first number");
        double input1double = input.nextDouble();
        System.out.println("Please input your second number");
        double input2double = input.nextDouble();
        System.out.println("Please state what to do with the inputted numbers");
        System.out.println("Current possible operations are: Add(+), Subtract(-), Multiply(*), Divide(/), Raise to(^)†, Nth Root(//)††");
        System.out.println("† 'Raise to' will raise your first number to your second");
        System.out.println("†† N = Your second input");
        Scanner operation = new Scanner(System.in);
        String operationstr = operation.nextLine();
        try {
            double result = switch (operationstr.toLowerCase(Locale.ROOT)) {
                case "+", "add" -> input1double + input2double;
                case "-", "subtract" -> input1double - input2double;
                case "*", "multiply" -> input1double * input2double;
                case "/", "divide" -> input1double / input2double;
                case "^", "raise" -> Math.pow(input1double, input2double);
                /*case "Root", "//", "root", "nth root", "Nth Root" -> {
                    if (input1double < 0) {

                    }
                    double n = 1/input2double;
                    result = Math.round(Math.pow(input1double, n));
                }
                case "gcd", "GCD", "gcf", "GCF" -> {
                    int input1int = (int) input1double;
                    int input2int = (int) input2double;
                    int prime;
                    int number;
                    int test = (int) Math.pow(25, 0.5);
                    result = test;
                }*/
                default -> throw new Exception();
            };
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("That operation is not supported, please try again.");
        }
    }
}
