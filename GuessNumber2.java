package GuessNumber;
import java.util.Scanner;
import java.util.Random;



public class GuessNumber2 {
	
	public static void guessNumber() {
		
		int guessNumber = 0;
		System.out.println(" Choose number form 1 to 10 );
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int randomNumber = new Random().nextInt(10)+1;
		guessNumber++;
		
		while( number != randomNumber) {
			System.out.println(" Try again ");
			number = input.nextInt();
			guessNumber++;
		}
		
		System.out.println(" You won ");
		System.out.println(guessNumber + " times ");
		
		input.close();
		
	}
 
	public static void main(String[] args){

	guessNumber();	
		
}   
}
