package com.learnjava.datatypesdemo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "***** Data Types Demo *****" );
        System.out.printf( "%,.2f", 12345678.9 );
        
        Locale locale  = new Locale("en", "IN");
        String pattern = "#,###.##";

        DecimalFormat decimalFormat = (DecimalFormat)
                NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);

        String format = decimalFormat.format(123456789.123);
        System.out.println(String.format("\nSalary= %s", format));
        
        // Basic Lambda Expression
        new Thread(()-> 
        {System.out.println("New thread created");}).start();
        
        // lambda expression to define the calculate method 
        ISquare square = (int x) -> x*x;
        System.out.println(String.format("Square of 5 is %s", square.calculate(5)));
    }
}
