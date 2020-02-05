package _01_Variables_Datatypes;

import java.util.Scanner;

public class ConvertCelsiusFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to input a double
        System.out.print("Enter a value  in Celsius: ");
        double celsius = input.nextDouble();
        // write the program to convert from Celsius to Farenheit
        // print the out put here.

    }
}
__________________________________________________________________________
package _01_Variables_Datatypes.assignment01;

import java.util.Scanner;

public class ConvertCelsiusFarenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// prompt user to input a double 
		System.out.println("Enter a value in celcius: ");
		 double celsius = input.nextDouble();
		 // write the program to convert from Celsius to Farenheit
		 // print the out put here.
		 double farenheit = (9*celsius)/5 + 32;
		 
		 System.out.println(celsius + " degree celsius in farenheit is: " + farenheit);
		 System.out.println("-------------------------");
	System.out.println("Enter a value in Farenhit: ");
		double farenhit = input.nextDouble();
		double celsius1 = (farenhit -32)*5/9;
		System.out.println(farenhit + "degree F in C is: " + celsius1);
		
	}
	
}
