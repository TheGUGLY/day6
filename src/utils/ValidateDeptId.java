package utils;
import custom_exception.InvalidDeptIdException;
public class ValidateDeptId {
		public static final String[] DEPTID = {"sales","hr","rnd","marketing"};
		public static boolean notMatched = true;
		public static void validateDeptId(String deptId) throws Exception{
			for(String str : DEPTID){
				if(str.equals(deptId.toLowerCase())){
					notMatched=false;
				}
			}
			if(notMatched){
				throw new InvalidDeptIdException("Department ID can be one of these : SALES,HR,RND,MARKETING !! Re-enter Department ID");
			}
		}
}
