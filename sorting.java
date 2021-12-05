import java.util.Arrays;

public class sorting {
	public static void main(String[] args) {
		int [] numbers = {5,1,3,4,10,6};
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int [] number = {5,1,3,4,10,6};
		insertionSort(number);
		System.out.println(Arrays.toString(number));
		
		int [] num = {5,1,3,4,10,6};
		bubbleSort(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void bubbleSort(int [] arr) {
		int n = arr.length;
		for (int j=0; j<n-1; j++) {
			if (arr[j]> arr [j+1]) {
				//swap
				arr[j]   = arr[j] ^ arr[j+1];
				arr[j+1] = arr[j] ^ arr[j+1];
				arr[j]   = arr[j] ^ arr[j+1];
				
				/*
				 * a = 3 ->011
				 * b = 4 ->100
				 * a = 011 ^ 100 => 111 => 7
				 * b = 111 ^ 100 => 011 => 3
				 * a = 111 ^ 011 => 100 =>4
				 */
			}
		}
	}
	//Research and Implement
	public static void insertionSort(int [] arr) {
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int ref = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > ref) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = ref;
        }
	}
	//Implement
	public static void selectionSort(int [] arr) {
		int n = arr.length;
		 
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
	}
}
