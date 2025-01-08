import java.io.IOException;

public class Exercise1 {
	
	public static void throwException(int exceptionNumber) throws Exception{
		if(exceptionNumber==1){
			throw new Exception();
		}
		if(exceptionNumber==2){
			throw new ArrayIndexOutOfBoundsException();
		}
		if(exceptionNumber==3){
			throw new IOException();
		}
		if(exceptionNumber==4){
			throw new IllegalArgumentException();
		}
		if(exceptionNumber==5){
			throw new NullPointerException();
		}
	}
	

	public static String catchException(int exceptionNumber){
		try{
			throwException(exceptionNumber);
		} catch (Exception exception) {
			return exception.getClass().getSimpleName();
			
		}
		return "NoException";
	}
	
	public static void main(String[] args) {
		int exceptionNumber=(int)(Math.random()*5) + 1;
		String exceptionName = catchException(exceptionNumber);
		System.out.println("Exception number: " + exceptionNumber);
		System.out.println("Exception name: " + exceptionName);
	}
	
}
