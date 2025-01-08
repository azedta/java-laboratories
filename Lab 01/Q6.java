import java.util.Scanner; 

public class Q6 {

	public static void main(String[] args)
	{

		// Creating an array that will store the 10 grades inputed by the user
		int studentsNumber = 10;
		double [] grades = new double [studentsNumber]; 

		/* Asking the user for input 
		   I made a while loop that asks the user for input and add that input as element into the array */
 		int i = 0;
 		while (i < 10) 
 		{
 			System.out.println("Please enter the grade for each student : ");
 			Scanner inputNum = new Scanner(System.in);
 			double grade = inputNum.nextDouble();
 			grades[i]= grade;
 			i++;
 		}

 		// Calling the calculateAverage()
 		System.out.println("The average of all the grades is : " +calculateAverage(grades));
 		// Calling the calculateMedian()
 		System.out.println("The median of all the grades is : " +calculateMedian(grades));
 		//Calling the calculateNumberFailed()
 		System.out.println("The number of students that fails is : " +calculateNumberFailed(grades));
 		//Calling the calculateNumberPassed()
 		System.out.println("The number of students that passes is : " +calculateNumberPassed(grades));

 	}

 	public static double calculateAverage(double[] notes)
 	{
		double sum = 0;
		double count=0;
		for (int i=0 ; i < notes.length ; i++)
		{
			sum += notes[i];
			count ++;
		}
		double average = sum / count;
		return average;
	}

	public static double calculateMedian(double[] notes)
	{
		
		// OREDERING PART 
		double aliasingVariable =0;

		for (int i=0 ; i < notes.length-1 ; i++)
		{
			int iMin  = i;
			
			if(true)
			{
				for (int j=i+1 ; j < notes.length ; j++) 
				{
					if(notes[j] < notes[iMin])
					{
						iMin = j;
					}
					
				}

				aliasingVariable = notes[i];
				notes[i]=notes[iMin];
				notes[iMin]=aliasingVariable;
			}
		}

		// MEDIAN PART
		double median=0;

		if (notes.length % 2 != 0)
		{
			median =notes[(notes.length-1)/2];
		}
		else if (notes.length % 2 == 0)
		{
			median = ( notes[(notes.length)/2-1]+notes[((notes.length)/2)] )/2; 
		}
		
		return median;
	}
 	

 	public static int calculateNumberFailed(double[] notes)
 	{
		int failedCounter = 0;
		for (int i=0 ; i < notes.length ; i++ )
		{
			if (notes[i] < 50)		
			{
				failedCounter++;
			}
		}
		return failedCounter;	
	}	

	public static int calculateNumberPassed(double[] notes){
		
		int passedCounter = 0;
		for (int i=0 ; i < notes.length ; i++ )
		{
			if (notes[i] >= 50)		
			{
				passedCounter++;
			}
		}
		return passedCounter;
	}

	
}
