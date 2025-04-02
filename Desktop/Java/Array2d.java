public class Array2d {
    public static void main(String [] args){
	int [][] arr = new int[3][3];
	arr[0][0] = 54;
	arr[0][1] = 16;
	arr[0][2] = 46;
	arr[1][0] = 34;
	arr[1][1] = 79;
	arr[1][2] = 0;
	arr[2][0] = 98;
	arr[2][1] = 36;
	arr[2][2] = 59;
	for(int i = 0; i < arr.length; i++)
	{
	    for(int j = 0; j < arr.length; j++)
	    {
		System.out.print(arr[i][j]);
		System.out.print(" ");
	    }
	    System.out.print("\n");
	}
    }
}

	
   
	