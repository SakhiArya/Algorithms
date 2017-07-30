package sorting;

public class SelectionSortDiffImpl {
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
