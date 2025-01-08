public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		// Your code here

		int[] afterArray = new int[beforeArray.length+1];
		
		if (beforeArray.length ==0 )  // This if statement is made typically for empty arrays
		{
			afterArray[0] = valueToInsert;
		}

		else if (beforeArray.length != 0 && indexToInsert<beforeArray.length)
		{

			for (int i=0 ; (i<beforeArray.length)  ; i++)
			{
				if ( i < indexToInsert )
				{
					afterArray[i]=beforeArray[i];
				}

				else if (i == indexToInsert)
				{
					afterArray[i]=valueToInsert;
					afterArray[i+1]=beforeArray[i];
				}

				else if (i > indexToInsert)
				{
					afterArray[i+1]=beforeArray[i];
				}
			}

		}

		else if ( (beforeArray.length !=0) && (indexToInsert==beforeArray.length) )
		{	
			for (int i=0; i<beforeArray.length;i++)
			{
				afterArray[i]=beforeArray[i];
			}
			
			afterArray[beforeArray.length]=valueToInsert;
		}
		
		
		
		return afterArray;
		
	}

	public static void main(String[] args){
	
		int[] beforeArray = {1,5,4,7,9,6};
		
		System.out.println("Array before insertion :");
		for( int element : beforeArray )
		{
			System.out.println(element);
		}

		System.out.println("Array after insertion  :" ); 
		for (int element : insertIntoArray(beforeArray,6,1111 ))
		{
			System.out.println(element);
		}
		
	}
}