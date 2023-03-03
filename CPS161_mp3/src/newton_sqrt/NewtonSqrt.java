package newton_sqrt;

import java.util.*;

public class NewtonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		Scanner input1 = new Scanner(System.in);
		double n = input1.nextDouble();
		
		double guess = n/2;
		double accuracy = 1;
		
		while(accuracy > 0.000001) {
			double newGuess = ((n / guess) + guess)/2;
			accuracy = guess - newGuess;
			
			if(accuracy <= 0.000001) {
				System.out.println("Newton: " + newGuess);
				System.out.println("Math: " + Math.sqrt(n));
			}
			else {
				guess = ((n / guess) + guess)/2;
			}
		}
	}

}
