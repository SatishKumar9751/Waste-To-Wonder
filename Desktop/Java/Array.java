/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        int[] arr1 = {5, 98, 98, 25, 34};
	int[] arr2 = {5, 8, 9, 2, 4};
	if(arr1.length == arr2.length)
	{	    
	    int[] sum = new int[arr1.length];
	    for(int i = 0; i < arr1.length; i++)
	    {
		sum[i] = arr1[i] + arr2[i];
	    }
	    for(int i = 0; i < sum.length; i++)
	    {
		System.out.print(sum[i] + " ");
	    }
	}
	else{
	    System.out.println("the length of both arrays must be same.");
	}
    }
}