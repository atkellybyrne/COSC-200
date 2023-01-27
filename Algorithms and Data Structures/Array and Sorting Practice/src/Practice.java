/*
 * Kelly Byrne, Chandler Blackwell
 * 
 * Array Sorting Practice
 * 01/23/2022
 */

// Imports
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// Makes a practice object called p
		Practice p = new Practice();
		
		// Two integer arrays of different lengths
		int[] arr1 = new int[10];
		int[] arr2 = new int[15];
		
		// Puts random values into the arrays using Math.random()
		for(int i=0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*42);
			
		}
				
		for(int i=0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random()*42);
		}
		
		// Prints out the two arrays
		System.out.println("The two initial arrays before being sorted: \n" + 
		Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2) + "\n");
		
		
		// Calls the SelectionSort() method
		System.out.println(p.SelectionSort(arr1));
		System.out.println(p.SelectionSort(arr2));
		
		// Calls the BubbleSort() method
		System.out.println(p.BubbleSort(arr1));
		System.out.println(p.BubbleSort(arr2));

		// Calls the InsertionSort() method
		System.out.println(p.InsertionSort(arr1));
		System.out.println(p.InsertionSort(arr2));
	}
	
	// Selection Sort Method
	public String SelectionSort(int[] arr) {
		
		// Iterates through the entire list
        for (int i=0; i < arr.length-1; i++){  
        	
        	// Sets a starting index to keep track of where it is
            int index = i;  
            
            // Inner for loop that goes one after i
            for (int j=i+1; j < arr.length; j++){ 
            	
            	// If the number at j (one after i) is less than the 
            	// number at the starting index, the new index is j
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
          
            // Swaps the numbers depending on what is bigger or smaller
            int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;  
        }  
		
        // Prints out the fully sorted array
		return "This is the sorted Array using Selection Sort: \n" 
        + Arrays.toString(arr) + "\n";
			
		
	}
	
	// Bubble Sort Method
	public String BubbleSort(int[] arr) {
 
		// Iterates through the array
        for(int i=0; i < arr.length; i++){
        	
        	// Iterates through again at the length minus whatever i is
        	for(int j=1; j < arr.length-i; j++){
        		// if the index at j-1 is greater than j then they
        		// need to switch
                if(arr[j-1] > arr[j]){    
                int temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                }    
        	}  
        }  
		
        // Print out the fully sorted array
		return "This is the sorted Array using Bubble Sort: \n" 
		        + Arrays.toString(arr) + "\n";
	}
	
	// InsertionSort Method
	public String InsertionSort(int[] arr) {
		
		// Iterates through the whole array
		for (int i = 1; i < arr.length; i++) {
			
			// Holds the current object from where arr is at i
			int current = arr[i];
			
			// New integer j that is one less than i
			int j = i-1;
            
			// While j is greater than or equal to zero and the number at 
			// j is greater than the current value...
			while (j >= 0 && arr[j] > current) {
				
				// The value at j+1 is equal to the value at j
				arr[j+1] = arr[j];
				
				// J is now one less than it was
				j = j-1;
			}
			
			// The value at j+1 is equal to the current value
			arr[j+1] = current;
		}
	        
		// Prints out the whole sorted array
		return "This is the sorted Array using Insertion Sort: \n" 
			        + Arrays.toString(arr) + "\n";
	}
	
}
