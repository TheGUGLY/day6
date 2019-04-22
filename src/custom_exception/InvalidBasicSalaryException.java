package custom_exception;

@SuppressWarnings("serial")
public class InvalidBasicSalaryException extends Exception{
	public InvalidBasicSalaryException(String message){
		super(message);
	}
}
