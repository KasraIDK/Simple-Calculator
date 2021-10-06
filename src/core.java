import java.util.Scanner;

public class core {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please input your first number");
        double input1double = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please input your second number");
        double input2double = input2.nextDouble();
        Scanner operation = new Scanner(System.in);
        System.out.println("Please state what to do with the inputted numbers");
        System.out.println("Current possible operations are: Add(+), Subtract(-), Multiply(*), Divide(/)");
        String operationstr = operation.nextLine();
        switch (operationstr) {
            case "Add", "+", "add" -> {
                double result = input1double + input2double;
                System.out.println("Result: " + result);
            }
            case "Subtract", "-", "subtract" -> {
                double result = input1double - input2double;
                System.out.println("Result: " + result);
            }
            case "Multiply", "*", "multiply" -> {
                double result = input1double * input2double;
                System.out.println("Result: " + result);
            }
            case "Divide", "/", "divide" -> {
                double result = input1double / input2double;
                System.out.println("Result: " + result);
            }
            default -> System.out.println("That operation is not supported, please try again.");
        }
    }
}
