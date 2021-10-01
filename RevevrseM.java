import java.util.*;

class RevevrseM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scn.nextInt();/* Name of the class has to be "Main" only if the class is public. */
		}
		int m = scn.nextInt();
		int l = 0;
		int r = m-1;
		while(l<r){
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;

		}
		//display
		System.out.println();
		for(int val : arr){
			System.out.print(val+" ");
		}
		scn.close();
	}
}

