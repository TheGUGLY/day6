package practice;

public abstract class Employee {
	private int id;
	private String name;
	private String email;
	private String deptId;
	private double basic;
	static int count=100;
	static int idCounter(){
		return ++count;
	}
	public Employee(String name,String email,String deptId,double basic){
	   id = idCounter();
	   this.name = name;
	   this.email  = email;
	   this.deptId = deptId;
	   this.basic = basic;
   }
	public int getId() {
		return id;
	}
	@Override
	public String toString(){
		return(this.id+" "+this.name+" "+this.email+" "+this.deptId+" "+this.basic);
	}
	
	public double getBasic() {
		return basic;
	}
	public abstract double getSalary();
	
	
	
}
