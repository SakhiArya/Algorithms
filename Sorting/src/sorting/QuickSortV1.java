package sorting;

//QUICKSORT WITH PIVOT AS LAST ELEMENT OF ARRAY
/* QuickSort in worse case is O(n2) where the Pivot picked is always the greatest or Smallest in the array
 * 
 * * 
 * 
 * 
 * */
public class QuickSortV1 {
	
	public static void main(String[] args) {
		int arr[] = {10,80,30,90,40,50,70};
		System.out.println("Input:");
		print(arr);
		QuickSortV1 obj = new QuickSortV1();
		obj.quickSort(arr,0,(arr.length)-1);
		System.out.println("\nOutput: ");
		print(arr);
	}
	
	public void quickSort(int arr[],int low,int high)
	{
		if(high <=low)
			return;
		int pivot =partition(arr,low,high );
		quickSort(arr,low,pivot-1);
		quickSort(arr,pivot+1,high);
		
	}
	public static void print (int[] arr)
	{
		for(int i = 0 ; i <arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int partition(int[] arr,int low,int high)
	{
		//to understand the division
		/*System.out.println("low "+low+"high "+high);*/
		int pivot =arr[high];
		int index =low-1 ;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				index++;
				int temp = arr[index];
				 arr[index]=arr[j];
				 arr[j]=temp;
				
			}
		
		}
		//swap pivot/high and index to place the pivot at correct  position
		index++;
		int temp = arr[index];
		arr[index]=arr[high];
		arr[high]=temp;
		return index;
	}
	

}
