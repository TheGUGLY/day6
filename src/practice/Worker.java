package practice;

public class Worker extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(String name,String email,String deptId,double basic,int hoursWorked,double hourlyRate){
			super(name,email,deptId,basic);
			this.hoursWorked = hoursWorked;
			this.hourlyRate = hourlyRate;
			}
	@Override
	public String toString(){
		return (super.toString()+" "+this.hourlyRate+" "+this.hoursWorked);
	}
	public double getSalary(){
		return (super.getBasic()+this.hourlyRate*this.hoursWorked);
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	
}
