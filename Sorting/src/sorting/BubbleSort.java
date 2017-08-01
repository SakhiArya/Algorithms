package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int ipArr[] ={5,12,64,1,37,90,91,97};
		bubbleSort(ipArr);
		print(ipArr);

	}
	public static void print(int[] arr)
	{
		for(int i = 0 ;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean swapped = false ;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
					swapped=true;
				}
			}
			if(swapped==false)
			{
				break;
			}

		}

	}
	private static void swap(int[] arr, int j, int i) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;

	}
}
