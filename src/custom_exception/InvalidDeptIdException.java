package custom_exception;

@SuppressWarnings("serial")
public class InvalidDeptIdException extends Exception{
		public InvalidDeptIdException(String message){
			super(message);
		}

}
