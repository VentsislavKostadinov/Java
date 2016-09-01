
package GuessNumber;
import java.util.Scanner;
import java.util.Random;

public class guessNumber {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println(" Choose number form 1 to 10 ");
int inputNumber =s.nextInt();
int randomNumber = new Random().nextInt(10)+1;
if(inputNumber==randomNumber){
System.out.println(" You won  ");
} else {
System.out.println(" You lost! ");
System.out.println(" The number was ");
System.out.println(randomNumber +".");
}
System.out.println(" Thank you ");
}    
}
