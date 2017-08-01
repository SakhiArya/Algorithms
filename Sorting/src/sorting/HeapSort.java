package sorting;
/*
 * #comparison based sorting algorithm
 * #in place algorithm
 * 
 * (an in-place algorithm is an algorithm which transforms input using no auxiliary data structure.
 * However a small amount of extra storage space is allowed for auxiliary variables.
 * The input is usually overwritten by the output as the algorithm executes.
 * In-place algorithm updates input sequence only through replacement or swapping of elements.)
 * 
 * #Although somewhat slower in practice on most machines than a well-implemented quicksort, 
 *    it has the advantage of a more favorable worst-case O(n log n) runtime
 *  
 *  BUT
 * # not a stable sort
 * 
 * */
public class HeapSort {
	//n=length of array 
	//i=index from where we need to heapify 

	//following function is O(log n) as, in every iteration we get rid of half of the tree/heap
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
	public static void swap(int[] arr,int i,int largest)
	{
		int temp = arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;

	}

	public static void print(int[] arr)
	{
		//System.out.println("after building heap");
		for(int i = 0; i <arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		int ipArr[] ={5,12,64,1,37,90,91,97};

		//build a heap ,where every node is greater than its childNode
		//for Loop O(n)
		//as heap function is O(log n) and is being called n times , total complexity of building a heap  is O(nlogn)
		for(int i =(ipArr.length/2)-1;i>=0;i--)
		{
			heapify(ipArr,ipArr.length,i);
		}
		//print after buildingMaxheap
		print(ipArr);
		// heap sort function is =building a heap + sorting (by swaping and heapifying) which is o(nlogn) again
		//so total complexity is O(nlogn)
		for(int i = 0;i<ipArr.length;i++)
		{
			swap(ipArr,0,ipArr.length-i-1);
			heapify(ipArr,ipArr.length-i-1,0);
		}
		print(ipArr);
	}

}
