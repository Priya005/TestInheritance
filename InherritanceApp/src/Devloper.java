
public class Devloper extends Employee {
	private int nofHrs;
	public Devloper(int empId, String empName, double empSalory,int nofHrs) {
		super(empId, empName, empSalory);
		this.nofHrs=nofHrs;
	}
	public int getNofHrs() {
		return nofHrs;
	}
	@Override
	public String toString() {
		return "Developer Id:"+getEmpId()+"\n"+"Developer Name:"+getEmpName()+"\n"+"Developer Salory"+getEmpSalory()+"\n"+"Dev Hours"+getNofHrs();
	}

	

	
	

}
