
public class Maneger extends Employee {
	private int bonus;
	public Maneger(int empId, String empName, double empSalory,int bonus) {
		super(empId, empName, empSalory);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}
	public int getBonus() {
		return bonus;
	}
	
	@Override
	public String toString() {
		return "Manager Id:"+getEmpId()+"\n"+"Manager Name:"+getEmpName()+"\n"+"Manager salory"+getEmpSalory()+"\n"+"Manager Bonus"+getBonus();
	}
	@Override
	public boolean equals(Object obj) {
		Maneger m2=(Maneger)obj;
		if(this.getEmpId()==m2.getEmpId()){
			return true;
		}
		return false;
	}
	
	

	
	

}
