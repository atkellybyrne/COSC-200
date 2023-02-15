import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		Practice p = new Practice();
		
		int[] arr = new int[17];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50);
		}
		
		System.out.println(Arrays.toString(arr));

		p.split(arr);
	}
	
	
	public int[] split(int[] arr1) {
		if(arr1.length <= 1) {
			return arr1;
		}
		int mid = 0;
		int[] arr2;
		int[] arr3;
		
		if(arr1.length/2 %2 == 0) {
			mid = arr1.length/2;
			arr2 = new int[mid];
			arr3 = new int[mid];
		}
		else {
			mid = arr1.length/2;
			arr2 = new int[mid];
			arr3 = new int[mid+1];
		}
		
		System.out.println("This is mid: " + mid);
		
		for(int i =0; i < mid; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i < mid; i++) {
			arr3[i] = arr1[i+mid];
		}
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));


		return arr1;
		
	}

}
