public class Q3_SquareArray {

	public static int[] createArray(int size) // this is the createArray method
	{
		
		int[] newArray = new int [size];
		for (int i=0 ; i < size ;i++) 
		{
			newArray[i]=i*i;
		}

		return newArray;
	}

	public static void main (String[] args) // this is the main method
	{
		int i=0 ;
		for (int numbers : createArray(1))
		{
			System.out.println("The square of "+ i +" is : "+numbers);
			i++;
		} 
	}
}