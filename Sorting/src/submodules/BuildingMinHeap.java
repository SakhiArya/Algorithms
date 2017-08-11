package submodules;

public class BuildingMinHeap {
	
	public static void swap(int[] arr,int i,int largest)
	{
		int temp = arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;
		
	}
	public static void minHeapify(int[] arr, int arrLength, int i)
	{
		int smallest= i;
		int lc = 2*i+1;
		int rc= 2*i+2;
		
		if(lc<arrLength&& arr[lc]<arr[smallest])
		{
			smallest=lc;
		}
		if(rc<arrLength&& arr[rc]<arr[smallest])
		{
			smallest = rc;
		}
		if(smallest!=i)
		{
			swap(arr,smallest,i);
			minHeapify(arr,arrLength,smallest);
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
		
		
		
		for(int i =(ipArr.length-1)/2;i>=0;i--)
		{
			minHeapify(ipArr,ipArr.length-1,i);
		}
		System.out.println("after converting to min heap");
		print(ipArr);
		for(int i = 0;i<ipArr.length;i++)
		{
			swap(ipArr,0,ipArr.length-i-1);
			minHeapify(ipArr,ipArr.length-i-1,0);
		}
		System.out.println("after heap sort");
		print(ipArr);
	}

}
