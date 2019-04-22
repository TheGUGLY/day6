package custom_exception;

@SuppressWarnings("serial")
public class InvalidEmailException  extends Exception{
	public InvalidEmailException(String message){
		super(message);
	}

}
