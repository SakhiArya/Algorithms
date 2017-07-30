package sorting;

/*Sort items one at a time 
 * LESS efficient on large List than more advanced algorithms such as quickSort,heap,merge 
 *Efficient for SMALL DATA sets  
 * efficient for substantially sorted array 
 * does not change the relative order of elements with equal keys
 * requires only O(1) additional storage space
 *CAN SORT A LIST AS IT RECIEVES (one comparison with counting sort)
 *
 *TimeComplexity O(n2)
 *
 *Auxillary Space O(1)
 *
 *Boundry case-1)when array is sorted in reverse order it would take maximum time to sort 
 *case-2) when array is already sorted 
 *
 *Algorithmic paradigm - INCREMENTAL APPROACH
 *
 *A sorting algorithm is said to be stable
 * if two objects with equal keys appear
 *  in the same order in sorted output as they appear in the input array to be sorted. 
 *  InsertionSort is stable
 *  
 *  Iinsertion sort runs much more efficiently if the array is already sorted or "close to sorted."
 *  While selection sort is preferable to insertion sort in terms of number of writes (theta(n) swaps versus O(n2) swaps)
 *  However Insertion sort and Selection sort are faster for small enough numbers(fewer than 10-20 elements)
 * */
/*             ALGORITHM
 * loop from 1 to n-1
 * pick element from i/p say i
 * insert into arr[0] to arr[i-1]
 */

public class InsertionSort {
	
	public static void insertionSort(int arr[])
	{
		 for(int i =1;i<arr.length;i++)
		 {
			 int j =i;
			 int key = arr[i];
			 while(j>=1 && arr[j-1]>key)
			 {
				 arr[j]=arr[j-1];
				 j--;
			 }
			 arr[j]=key;
		 }
		 for(int i =0;i <arr.length;i++)
		 System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		int[] ipArr={12, 11, 13, 5, 6};
		insertionSort(ipArr);
		
	}

}
