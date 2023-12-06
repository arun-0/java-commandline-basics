import java.io.Console;

public class CalculatorByLalit {

    public static void main(String[] args) {
        Console console = System.console();

        String firstInput = console.readLine("Enter first number: ");
        String secondInput = console.readLine("Enter second number: ");

        int a = Integer.parseInt(firstInput);
        int b = Integer.parseInt(secondInput);

        System.out.println("a + b = " + Util.add(a,b) );
        System.out.println("a * b = " + Util.multiply(a,b) );
        System.out.println("a/b = " + Util.divide(a,b) );
    }

}