package tester;
import practice.*;
import java.util.Scanner;
import static utils.ValidateEmail.*;
import static utils.ValidateBasicSalary.*;
import static utils.ValidateDeptId.*;
import custom_exception.*;
public class TestOrg{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name=null,email=null,deptId=null;
		int hoursWorked=0;
		double basicSalary=0,performanceBonus=0,hourlyRate=0;
		System.out.println("Enter the maximun Number of Employees");
		Employee[] emp = new Employee[scan.nextInt()];
		boolean flag=true;
		int counter=0;
		do{
			System.out.println("1.Hire Manager");
			System.out.println("2.Hire Worker");
			System.out.println("3.Get Details");
			System.out.println("4.Employee Specific Details");
			System.out.println("5.Fire an Employee");
			System.out.println("6.Salary Increment");
			System.out.println("7.Exit");
				switch(scan.nextInt()){
				case 1:	if(counter == emp.length){
							System.out.println("Memory full");
							break;
						}
						scan.nextLine();
						System.out.println("Enter Name,Email,Department Id,Basic Salary,Performance Bonus");
						//taking name as input from user
						name=scan.nextLine();
						// taking email as input from user and validating it
						do{
						try{
						email=scan.nextLine();
						validateEmail(email);
						flag=false;
						}
						catch(Exception e){
							System.out.println(e.getMessage());
							flag=true;
						}
						}while(flag);
						//taking department ID as input from user and validating it
						do{
							try{
							deptId=scan.nextLine();
							validateDeptId(deptId);
							flag=false;
							}
							catch(Exception e){
								System.out.println(e.getMessage());
								flag=true;
							}
							}while(flag);
						//taking basic salary as input from user and validating it
						do{
							try{
							basicSalary=scan.nextDouble();
							validateBasicSalary(basicSalary);
							flag=false;
							}
							catch(Exception e){
								System.out.println(e.getMessage());
								flag=true;
							}
							}while(flag);
						//taking performance bonus as input from user 
						performanceBonus=scan.nextDouble();
						
						emp[counter++] = new Manager(name,email,deptId,basicSalary,performanceBonus);
						scan.nextLine();
						break;
				case 2:	if(counter == emp.length){
							System.out.println("Memory full");
							break;
						}
						scan.nextLine();
						System.out.println("Enter Name,Email,Department Id,Basic Salary,Hours Worked, Hourly Rate");
						//taking name as input from user
						name=scan.nextLine();
						// taking email as input from user and validating it
						do{
						try{
						email=scan.nextLine();
						validateEmail(email);
						flag=false;
						}
						catch(Exception e){
							System.out.println(e.getMessage());
							flag=true;
						}
						}while(flag);
						//taking department ID as input from user and validating it
						do{
							try{
							deptId=scan.nextLine();
							validateDeptId(deptId);
							flag=false;
							}
							catch(Exception e){
								System.out.println(e.getMessage());
								flag=true;
							}
							}while(flag);
						//taking basic salary as input from user and validating it
						do{
							try{
							basicSalary=scan.nextDouble();
							validateBasicSalary(basicSalary);
							flag=false;
							}
							catch(Exception e){
								System.out.println(e.getMessage());
								flag=true;
							}
							}while(flag);
						hoursWorked = scan.nextInt();
						hourlyRate = scan.nextDouble();
						emp[counter++] = new Worker(name,email,deptId,basicSalary,hoursWorked,hourlyRate);
						break;
				case 3: for(int i=0;i<counter;i++){
							System.out.println(emp[i]);
						}
						break;
				case 4: flag=true;
						System.out.println("Enter Employee Id");
						int temp = scan.nextInt();
						for(int i=0;i<counter;i++){
							if(emp[i].getId()==temp){
								System.out.println(emp[i]);
								flag=false;
								break;
							}
						}
						if(flag){
							System.out.println("Invalid Id");
						}
						break;
				case 5:	flag=true;
						System.out.println("Enter Employee Id to fire");
						temp = scan.nextInt();
						for(int i=0;i<counter;i++){
							if(emp[i].getId()==temp){
								emp[i]=null;
								for(int j=i;j<counter;j++){
									emp[j]=emp[j+1];
								}
								counter--;
								System.out.println("Fired Successfully");
								flag=false;
								break;
							}
						}
						if(flag){
							System.out.println("Invalid Id");
						}
						break;
				case 6: 
						break;
				case 7:	if(scan!=null)
						scan.close(); 
						return;
				}
				
			}while(true);
	}

}
