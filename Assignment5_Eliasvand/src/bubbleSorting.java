import java.security.SecureRandom;

public class bubbleSorting {
	
	public static void main(String[] args) {
		
		
		int [] array = new int [30];
		
		SecureRandom genarator = new SecureRandom();
		
		
		for(int i = 0 ;i < array.length; i++) {
			array[i] = genarator.nextInt(1001);
		}
		
		System.out.print("The unsorted array: ");
		for(int i = 0 ;i< array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		bubbleSorting obj = new bubbleSorting();
		
		obj.bubbleSort(array);
		
		System.out.println();

		System.out.print("The sorted array: ");
		for(int  i = 0 ;i< array.length; i++ ) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		
	}
	public void bubbleSort(int[] array) {
		int i, j, temp = 0;
		
		for (i = 0; i < array.length ; i++) {
			
			for (j = 1; j < array.length - i ; j++) {
				if (array[j-1] > array[j]) {			
					temp = array[j-1];	
					array[j-1] = array[j];	
					array [j] = temp;	
				}	
			}
		}		
	}
	
}