package submodules;

public class MergeTwoArrays {

	public static void mergeSort(int[] arr1,int[] arr2)
	{
		int[] arr3 = new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;

		while(i < arr1.length && j< arr2.length )
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else{
				arr3[k]=arr2[j];
				k++;
				j++;
			}

		}
		if(i<arr1.length)
		{
			/*for(int a=i;a>arr1.length;a++)
			{	arr3[k]=arr1[a];
			k++;}*/


			/*OR WE CAN USE ALREADY EXISTING API,, COMPLEXITY =O(n)*/

			System.arraycopy(arr1, i, arr3, k, arr1.length-i);

		}
		if(j<arr2.length)
		{
			/*for(int a =j;a<arr2.length;a++)
			{arr3[k]=arr2[a];
			k++;}*/
			/*OR WE CAN USE ALREADY EXISTING API,,Complexity O(n)  */
				System.arraycopy(arr2, j, arr3, k, arr2.length-j);
		}
		print(arr3);

	}


	public static void print(int[] arr)
	{
		for(int i = 0 ;i <arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {


		int arr1[]={3,6,9,10,15,17};
		int arr2[]={2,4,8,19,18};
		mergeSort(arr1, arr2);


	}
}
