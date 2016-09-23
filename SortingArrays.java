package Examples;

import java.util.Arrays;

public class SortingArrays {
	
	
	public static void sortArrays() {
		
int[] numbers = { 5, 3, 8, 7, 10, 100, 21, 50, 1001};
		
		Arrays.sort(numbers);
		
         for( int i : numbers) {
        	 
        	 System.out.printf(" Numbers: %d ", i);
       }
		
	}
	
	public static void main(String[] args) {
		
		sortArrays();
		
    }

}
