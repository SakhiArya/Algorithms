package sorting;

/*Time complexity of Merge Sort is 
 * \O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array in two halves and take linear time to merge two halves.
 * Algorithm Paradigm : divide and conquer
 * 
 * 
 * 
 * */
import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = {37,28,43,3,9,82,10};
		int end = arr.length-1;
		mergeSort(arr,0,end);
		print(arr);

	}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void mergeSort(int[] arr, int start ,int end)
	{
		if(start == end)
			return;
		int mid =(start+end)/2;
		
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start ,end);
		
		
	}
	public static void merge(int[] arr,int start ,int end)
	{
		
        int mid = (start+end)/2;
		int i=start;
		int j = mid+1;
		int k=0;
		int [] newArr = new int[end-start+1];
		while(i<=mid && j<=end)
		{
			if(arr[i]<arr[j])
			{
				newArr[k]=arr[i];
				i++;
			}
			else
			{
				newArr[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			newArr[k]=arr[i];
			k++;
			i++;
		}
		if(j<=end)
		{
			newArr[k]=arr[j];
			k++;
			j++;
		}
		System.arraycopy(newArr, 0, arr, start, end-start+1);
	}

	
}