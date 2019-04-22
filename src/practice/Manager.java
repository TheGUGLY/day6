package practice;

public class Manager extends Employee {
		private double perfBonus;
		
		public Manager(String name,String email,String deptId,double basic,double perfBonus){
			super(name,email,deptId,basic);
			this.perfBonus = perfBonus;
		}
		@Override
		public String toString(){
			return (super.toString()+" "+this.perfBonus);
		}
		@Override
		public double getSalary(){
			return (super.getBasic()+this.perfBonus);
		}
}
