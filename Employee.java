
public class Employee extends Person{
	private int employeeID;
	private String employeeDepartment;
	public Employee(){
		super();
		employeeID = 0;
		employeeDepartment = "Undefined Department";
	}
	public Employee(String initialName, int initialEmployeeID, String initialEmployeeDepartment){
		super(initialName);
		employeeID = initialEmployeeID;
		employeeDepartment = initialEmployeeDepartment;
	}
	public void reset(String newName, int newEmployeeID, String newEmployeeDepartment){
		setName(newName);
		employeeID = newEmployeeID;
		employeeDepartment = newEmployeeDepartment;
	}
	public int getEmployeeID(){
		return employeeID;
	}
	public String getEmployeeDepartment(){
		return employeeDepartment;
	}
	public void setEmployeeID(int newEmployeeID){
		employeeID = newEmployeeID;
	}
	public void setEmployeeDepartment(String newEmployeeDepartment){
		employeeDepartment = newEmployeeDepartment;
	}
	public void writeOutput(){
		System.out.println("Name: "+ getName());
		System.out.println("Employee ID: "+ employeeID);
		System.out.println("Employee Department: "+ employeeDepartment);
	}
	public boolean equals(Employee otherEmployee){
		return this.hasSameName(otherEmployee) &&
				(this.employeeID == otherEmployee.employeeID);
	}
}
