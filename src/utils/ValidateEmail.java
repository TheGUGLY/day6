package utils;
import custom_exception.InvalidEmailException;
public class ValidateEmail {
	public static final int MIN_LENGTH = 5;
	public static final int MAX_LENGTH =10;
	
	public static void validateEmail(String email) throws Exception{
		if(email.length()>10||email.length()<5){
			throw new InvalidEmailException("Email must contain 5-10 letters only!! Please Re-enter email");
		}
		if(!email.contains("@")){
			throw new InvalidEmailException("Email must contain @. Please Re-enter email");
		}
	}	
}
