package submodules;
/*Building heap from array( A)
 * A[] ={5,12,64,1,37,90,91,97}
 * for(i=[length(A)/2] to 1,i--;
 * heapify(A,length,i)
 * 
 * #need to maintain the property of nearly complete Binary tree
 * */
public class BuildingMaxHeap {
	
	public static void swap(int[] arr,int i,int largest)
	{
		int temp = arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;
		
	}
	
	public static void heapify(int[] arr, int n,int i)
	{
		int largest = i;
		int leftChild=2*i+1;
		int rightChild=2*i+2;
		if(leftChild<n && arr[leftChild]>arr[largest])
			largest=leftChild;
        if(rightChild<n && arr[rightChild]>arr[largest])
            largest=rightChild;
        if(largest!=i)
        {
        	swap(arr,i,largest);
        	heapify(arr,n,largest);
        }
        	
	}
	public static void print(int[] arr)
	{
		System.out.println("after building heap");
		for(int i = 0; i <arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int ipArr[] ={5,12,64,1,37,90,91,97};
		for(int i =(ipArr.length/2)-1;i>=0;i--)
		{
			heapify(ipArr,ipArr.length,i);
		}
		print(ipArr);
	}
}
