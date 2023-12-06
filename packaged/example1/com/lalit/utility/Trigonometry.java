package com.lalit.utility;

public class Trigonometry {
    public static double sine(int degrees) {
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
        // sin() method to get the sine value 
        double sinValue = Math.sin(radians); 

		return sinValue;
    }

    public static double cosine(int degrees) {
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
        // sin() method to get the cosine value 
        double cosValue = Math.cos(radians); 

		return cosValue;
    }

}