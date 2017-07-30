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
		int countArr[] =new int[max-min+1];
		int opArr[] = new int[ipArr.length];
		Arrays.fill(countArr, 0);
		for(int i = 0; i <ipArr.length;i++)
		{
			++countArr[ipArr[i]-min];
		}
		for(int i=1;i<countArr.length;i++)
		{
			countArr[i] += countArr[i-1];
		}

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

