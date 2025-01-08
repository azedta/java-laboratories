public class Q3_AverageDemo {
	
	public static void main(String[] args) {
		double[] valuesArray;
		valuesArray =new double [] {0.0};
		System.out.println("The average is: " + calculateAverage(valuesArray));
	}

	//method that calculates the average of the numbers in an array
	public static double calculateAverage(double[] values){
		double result;
		double sum =0;
		double count=0;
		for (int i=0 ; i<values.length ; i++) 
		{
			sum += values[i];
			count++;
		}
		result = sum / count;
		return result;
	}
}