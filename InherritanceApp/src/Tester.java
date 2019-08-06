
public class Tester extends Employee{
	 private int nofTestcases;

	public Tester(int empId, String empName, double empSalory, int nofTestcases) {
		super(empId, empName, empSalory);
		this.nofTestcases = nofTestcases;
	}

	public int getNofTestcases() {
		return nofTestcases;
	}

	@Override
	public String toString() {
		return "Tester Id"+getEmpId()+"Tester Name"+getEmpName()+"Tester salary"+getEmpSalory()+"No of cases"+nofTestcases;

	 

}
}