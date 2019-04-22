package utils;

import custom_exception.InvalidBasicSalaryException;

public class ValidateBasicSalary {
	public static final int MULTI = 1000;
	public static void validateBasicSalary(double salary) throws Exception{
		if(!(salary % MULTI==0)){
			throw new InvalidBasicSalaryException("Basic salary must be a multiple of "+MULTI);
		}
	}

}
