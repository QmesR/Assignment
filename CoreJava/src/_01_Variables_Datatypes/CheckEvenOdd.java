package _01_Variables_Datatypes;

import org.w3c.dom.ls.LSOutput;


/**
 * Use scanner to take input dynamically.
 */
public class CheckEvenOdd {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Enter an Integer number:");

        boolean isOdd = false;// use the module operator to check if a number is odd or even.(Google it)
        System.out.println("The number entered "+ num +" is Odd ? "+ isOdd);
    }
}
__________________________________________________________________
import java.util.Scanner;
/**
 * 
 * @author umesr
 * Use scanner to take input dynamically.
 */
public class CheckEvenOdd {
	public static void main(String[] args) {
		int x =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer number:");
		x = sc.nextInt();
		
		if (x % 2 == 0) 
			System.out.println("Your number is EVEN.");
			
		else 
			System.out.println("Your number is ODD.");
    }
}
