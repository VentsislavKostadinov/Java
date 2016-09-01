package Examples;

import java.util.Arrays;

public class SortingArrays {
	
	public static void main(String[] args) {
		
		int[] numbers = { 5, 3, 8, 7, 10, 100, 21, 50, 1001};
		
		Arrays.sort(numbers);
		
         for( int i : numbers) {
        	 
        	 System.out.printf(" Numbers: %d ", i);
       }
		System.out.println();
         
         
		for(int i = numbers.length -1 ; i>=0; i--) {
			
		System.out.printf(" Numbers %d", numbers[i]);
		}
	}

}
