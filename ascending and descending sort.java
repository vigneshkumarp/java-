// Java program to sort first k elements 
// in increasing order and remaining 
// n-k elements in decreasing 
import java.util.*; 

class Ascending and descending sort { 
	// function to print half of the array in 
	// ascending order and the other half in 
	// descending order 
	static void printOrder(int[] arr, int n, int k) 
	{ 
		int len1 = k, len2 = n - k; 
		int[] arr1 = new int[k]; 
		int[] arr2 = new int[n - k]; 

		// Store the k elements in an array 
		for (int i = 0; i < k; i++) 
			arr1[i] = arr[i]; 

		// Store the remaining n-k elements in an array 
		for (int i = k; i < n; i++) 
			arr2[i - k] = arr[i]; 

		// sorting the array from 0 to k-1 places 
		Arrays.sort(arr1, 0, k); 

		// sorting the array from k to n places 
		Arrays.sort(arr2, k, n - k); 

		// storing the values in the final array arr 
		for (int i = 0; i < n; i++) { 
			if (i < k) 
				arr[i] = arr1[i]; 

			else { 
				arr[i] = arr2[len2 - 1]; 
				len2--; 
			} 
		} 
		// printing the array 
		for (int i = 0; i < n; i++) { 
			System.out.print(arr[i] + " "); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int arr[] = { 5, 4, 6, 2, 1, 3, 8, 9, -1 }; 
		int k = 4; 
		int n = arr.length; 
		printOrder(arr, n, k); 
	} 
} 
