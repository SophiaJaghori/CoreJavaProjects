package day03;

public class EmployeeObjectArray {
	int empId;
	String empName;
	double empSalary;
	
	
	public EmployeeObjectArray() {
		
	}
	public EmployeeObjectArray(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {// getter always returns the property
		return empId;
	}
	public void setEmpId(int empId) {// setter method initializes the property
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
