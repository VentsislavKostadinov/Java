package Examples;

import java.util.Arrays;

public class ArraysExample {
	
	public static void main(String[] args) {
		
		int[] arrays = {1, 2, 3, 4, 5, 6};
	
	// reversed 1 example	
	//	for(int i = arrays.length - 1; i >=0; i--) {
	//	System.out.print(arrays[i]);
	//	}
		
		for (int i = arrays.length -1; i >=0 ; i--) {
			
			System.out.println(arrays[i]);
		}
	
	
	// reversed example 2
	
	//	int length = arrays.length;
	//	int[] reversed = new int[length];
		
	//	for(int i = 0; i < length; i++) {
			
	//		reversed[length - i - 1] = arrays[i];
	//	}
		//System.out.println(Arrays.toString(reversed));
		
		// example 1:	1, 2, 3, 4, 5, 6 System.out.println(Arrays.toString(arrays));
		
		// example 2
		
	//	for(int array :arrays) {
	//		System.out.print(array);
	//	}
		
		
}

}
