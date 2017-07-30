package sorting;

import java.util.Arrays;


public class CountingSort {

	public static void main(String[] args) {
		int ipArr[]={1, 4, 1, 2, 7, 5, 2};
		//	int ipArr[]={10,7,12,4,9,13};		
		int max=ipArr[0];
		int min=ipArr[0];
		for(int i =0 ; i <ipArr.length;i++)
		{
			if(min>ipArr[i])
				min =ipArr[i];
			if(max<ipArr[i])
				max=ipArr[i];
		}

	}
	public static void countSort(int[] ipArr,int min,int max)
	{
		//creates the array with the required size
		int countArr[] =new int[max-min+1];
		int opArr[] = new int[ipArr.length];
		//initialize the array elements with zero
		Arrays.fill(countArr, 0);
		//count the number of occurences of each element
		for(int i = 0; i <ipArr.length;i++)
		{
			++countArr[ipArr[i]-min];
		}
		//creates the index for each element by cumilation
		for(int i=1;i<countArr.length;i++)
		{
			countArr[i] += countArr[i-1];
		}
                //process the i/p array for output
		for(int i = 0 ;i <ipArr.length;i++)
		{
			int indexForCount=ipArr[i]-min;
			int indexforOpArr= countArr[indexForCount];
			--countArr[indexForCount];
			opArr[indexforOpArr-1]= ipArr[i];
		}
		for(int i = 0 ;i <opArr.length;i++)
		{
			System.out.print(opArr[i]+" ");
		}

	}
}

