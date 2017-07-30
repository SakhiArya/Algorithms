package sorting;
/*
 * ALGORITHMIC PARDIGM :In Place comparison sort
 * Generally performs worse than similar Insertion sort
 * Selection sort is noted for- when auxiliary memory is limited.
 * How is it similar to Insertion Sort ??
 * in both the sorting algorithm first K elements in the array are in sorted order
 * Insertion sort advantage is that it only scans as many elements as it needs
 *  in order to place the k+1 st element
 *  While selection sort is preferable to insertion sort in terms of number of writes (theta(n) swaps versus O(n2) swaps)
 *  Selection sort is generally outperformed on larger arrays 
 *  by theta(nlogn) by divide and conquer algorithms such as merge sort.
 *  However Insertion sort and Selection sort are faster for small enough numbers(fewer than 10-20 elements)
 *  Time Complexity: O(n2) as there are two nested loops.
 *  Auxiliary Space: O(1)
 *The good thing about selection sort is it never makes more than O(n) swaps
 and can be useful when memory write is a costly operation
 * */
public class SelectionSort {
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int index =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[index]>arr[j])
				{
					
					index=j;
				}
			}
			int temp =arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		printArr(arr);
		
	}
	public static void printArr(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] ipArr ={64, 25, 12, 22, 11};
		selectionSort(ipArr);
	}

}
