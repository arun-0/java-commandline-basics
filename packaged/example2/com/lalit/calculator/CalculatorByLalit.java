package com.lalit.calculator;
import java.io.Console;
import com.lalit.utility.Arithmatic;
import com.lalit.utility.Trigonometry;

public class CalculatorByLalit {

    public static void main(String[] args) {
        Console console = System.console();

        String firstInput = console.readLine("Enter first number: ");
        String secondInput = console.readLine("Enter second number: ");

        int a = Integer.parseInt(firstInput);
        int b = Integer.parseInt(secondInput);

        System.out.println("a + b = " + Arithmatic.add(a,b) );
        System.out.println("a * b = " + Arithmatic.multiply(a,b) );
        System.out.println("a/b = " + Arithmatic.divide(a,b) );
        System.out.println();

        String degrees = console.readLine("Enter Theta in degrees: ");
        int theta = Integer.parseInt(degrees);

        System.out.println("sin(" + theta + ") = " + Trigonometry.sine(theta));
        System.out.println("cos(" + theta + ") = " + Trigonometry.cosine(theta));
    }

}