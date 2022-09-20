import java.util.Scanner;

public class Exploration {

	public static void main(String[] args) {
	
		int x;
		x=0;
		Scanner kboard; 
		kboard= new Scanner (System.in);
		
		if (x==0) {
		System.out.println("Enter 1 for birth year guesser");
		System.out.println("Enter 2 for number calculation");
		System.out.println("Enter 3 for ");
		x=kboard.nextInt();
		}
		
		if (x==1) {
			int Birth;
			System.out.println("");
			System.out.println("What is your age?");
			Birth=kboard.nextInt();
			Birth = 2022 - Birth;
			System.out.println("You were born in " + Birth);
			System.out.println("");
		}
		
		if (x==2) {
			double a, b, quotient, sum, difference, product;
			System.out.println("Enter a number");
			a = kboard.nextInt();
			System.out.println("Enter another number");
			b = kboard.nextInt();
			
			sum=a+b;
			difference= a-b;
			product = a*b;
			quotient=a/b;
			
			System.out.println("");
			System.out.println("The sum of the numbers is: " + sum);
			System.out.println("");
			System.out.println("The differnce of the numbers is: " + difference);
			System.out.println("");
			System.out.println("The product of the numbers is: " + product);
			System.out.println("");
			System.out.println("The quotient of the numbers is: " + quotient);
		}
		
		if (x==3) {
			
		}

	}

}
