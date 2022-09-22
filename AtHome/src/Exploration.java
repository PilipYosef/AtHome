import java.util.Scanner;

public class Exploration {

	public static void main(String[] args) {
	
		int x;
		x=0;
		Scanner kboard; 
		kboard= new Scanner (System.in);
			
		if (x==0) {
			System.out.println("Enter 1 for Birth Year Guesser");
			System.out.println("Enter 2 for Number Calculation");
			System.out.println("Enter 3 for Story maker ");
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
			System.out.println("");
			System.out.println("To go back input 0:");
			x=kboard.nextInt();
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
			System.out.println("");
			System.out.println("To go back input 0:");
			x=kboard.nextInt();
		}
		
		if (x==3) {
			
		kboard= new Scanner (System.in);
		
		String fname;
		String lname;
		String adj;
		String verb;
		String adverb;
		String noun;
		
		System.out.println("Follow the directions");
		System.out.println("");
		System.out.println("Input a first name:");
		fname=kboard.nextLine();
		System.out.println("Input a last name:");
		lname=kboard.nextLine();
		System.out.println("Input an adjective:");
		adj=kboard.nextLine();
		System.out.println("Input a verb:");
		verb=kboard.nextLine();
		System.out.println("Input an adverb:");
		adverb=kboard.nextLine();
		System.out.println("Input a noun:");
		noun=kboard.nextLine();
		System.out.println("Here is a story:");
		System.out.println("");
		System.out.println("One day, " + fname +" "+ lname + " was in the park.");
		System.out.println("Suddenly a " + adj + " " + noun + " flew at " + fname);
		System.out.println("Mr." + lname + " " + adverb + " " + verb +" to the side to get out the way.");
		System.out.println("\"What a day\" " + fname + " said");
		
		
		}
		
		if (x==90210) {
			
			int scott;
			String next;
			
			System.out.println("<=====================>");
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(" You've found a secret");
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("<=====================>");
			System.out.println("");
			System.out.println("");
			System.out.println("Click enter to begin");
			scott=kboard.nextInt();
			System.out.println("My granny called, she said, \"Travvy, you work too hard");
			System.out.println("I'm worried you forget about me\"");
			System.out.println("I'm falling in and out of clouds, don't worry, I'ma get it, granny, uh");
			System.out.println("What happened? Now my daddy happy, mama called me up");
			System.out.println("That money coming and she love me, I done made it now");
			System.out.println("That money coming and she love me, I done made it now");
			System.out.println("I done found life's meaning now, all them her heart'd break");
			System.out.println("Her heart not in pieces now");
			System.out.println("Friends turning into fraud fellas");
			System.out.println("Practicing half the passion, you fellas packaged different");
			System.out.println("All you fellas, you fellas want the swag, you can't have it");
			System.out.println("I'ma sell it, you fellas salary 'bout to cap, snitch");
			System.out.println("Youngest fella out of Houston at the Grammys");
			System.out.println("Smiling at 'em laughing at me");
			System.out.println("I passed the rock to Ye, he pump faked and passed it back, snitch");
			System.out.println("All of this off of rapping, should've wrote this in Latin");
			System.out.println("");
			System.out.println("whats next?");
			next=kboard.nextLine();
			System.out.println(next);
			System.out.println("I know, I know, I know, I know, I know");
			System.out.println("Cuzzo said we in the store, yeah, we 'bout to drop a four");
			System.out.println("He passed the cigarette, I choke, woo");
			 
			 
		}
		
	}

}
