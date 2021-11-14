import java.util.Scanner;

public class core {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first number");
        double input1double = input.nextDouble();
        System.out.println("Please input your second number");
        double input2double = input.nextDouble();
        System.out.println("Please state what to do with the inputted numbers");
        System.out.println("Current possible operations are: Add(+), Subtract(-), Multiply(*), Divide(/)");
        Scanner operation = new Scanner(System.in);
        String operationstr = operation.nextLine();
        double result;
        double leftover;
        switch (operationstr) {
            case "Add", "+", "add" -> result = input1double + input2double;
            case "Subtract", "-", "subtract" -> result = input1double - input2double;
            case "Multiply", "*", "multiply" -> result = input1double * input2double;
            case "Divide", "/", "divide" -> result = input1double / input2double;
            default -> {
                System.out.println("That operation is not supported, please try again.");
                return;
            }
        }
        System.out.println("Result: " + result);
    }
}
