import java.io.Console;

public class CalculatorByLalit {

    public static void main(String[] args) {
        Console console = System.console();

        String firstInput = console.readLine("Enter first number: ");
        String secondInput = console.readLine("Enter second number: ");

        int a = Integer.parseInt(firstInput);
        int b = Integer.parseInt(secondInput);

        System.out.println("a + b = " + add(a,b) );
        System.out.println("a * b = " + multiply(a,b) );
        System.out.println("a/b = " + divide(a,b) );
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

}