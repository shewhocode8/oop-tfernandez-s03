public class ExceptionHandling{
	public static void main (String[] args){
		try {
			// code that may cause an exception
			int number = Integer.parseInt("number");
		} catch (NumberFormatException nfe){
			// code that we want to execute if this type of exception
			System.out.println("This code is error.");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("End here.");
	}
}