package programString;

import java.util.Arrays;

public class Umbrellas {

	private static int getminCount(int arr[],int n)
	{
		if(arr==null || arr.length==0||n<1)
		  return -1;
		
		int i=arr.length-1;
		Arrays.sort(arr);
		int count=0;
		while(n >= 0 && i >= 0)
		{
			count += n/arr[i];
			n=n%arr[i];
			i--;
		}
		if(n!=0)
		{
			return -1;
		}
		else
		{
			return count;
		}
	}
	public static void main(String[] args) {
		int a[]=new int[] {1,2};
		int k=Umbrellas.getminCount(a, 3);
		System.out.println(k);
	}

}
