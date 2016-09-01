
package GuessNumber;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber3 {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int guessNumber = 0;
System.out.println(" guess the number ");
int inputNumber = s.nextInt();
int randomNumber = new Random().nextInt(10)+1;
guessNumber++;
while(inputNumber!=randomNumber){

System.out.println(" try again ");
inputNumber = s.nextInt();
guessNumber++;
}
System.out.println(" Won after ");
System.out.println(guessNumber + " tries ");
}    
}
